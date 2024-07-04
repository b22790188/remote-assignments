package org.example.week3;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserNameController {

    /**
     * @param name  Cookie value from browser
     * @param model Used to pass attribute to view
     * @return The name of view to be rendered
     */

    @GetMapping("/myName")
    public String getNameInCookie(@CookieValue(name = "NAME", required = false) String name, Model model) {
        /*
         * If `userName` is not null, pass `userName` to `userName.html` to display the user's name.
         * Otherwise, the screen will show a form to prompt the user to enter their name since `userName`
         * is not provided.
         */
        if (name != null) {
            model.addAttribute("name", name);
        } else {
            model.addAttribute("message", "I don't know your name, input it!");
        }
        return "userName";
    }

    /**
     * @param name     Query parameter passed by form.
     * @param response Used to add cookie.
     * @return String Target redirect URL
     */
    @GetMapping("/trackName")
    public String trackName(@RequestParam(name = "name") String name, HttpServletResponse response) {
        Cookie cookie = new Cookie("NAME", name);
        response.addCookie(cookie);

        return "redirect:/myName";
    }

}
