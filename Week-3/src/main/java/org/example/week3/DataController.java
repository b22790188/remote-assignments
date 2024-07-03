package org.example.week3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@Controller
public class DataController {

    /**
     * @param number user input
     * @param model used to pass attribute to view
     * @return String The name of view to be rendered
     */
    @GetMapping("/data")
    public String sum(@RequestParam(required = false) Integer number, Model model) {
        try {
            int sum = number * (1 + number) / 2;
            model.addAttribute("sum", sum);
        }catch(NullPointerException npe){
            model.addAttribute("message", "Lack of Parameter");
        }

        return "data";
    }

    /**
     *
     * @param ex MethodArgumentTypeMismatchException
     * @param model used to pass attribute to view
     * @return The name of the view to be rendered
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleException(MethodArgumentTypeMismatchException ex, Model model) {
        model.addAttribute("message", "Wrong Parameter Type! Please input number");
        return "data";
    }
}
