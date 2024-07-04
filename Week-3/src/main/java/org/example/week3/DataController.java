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
     * @param number User input
     * @param model  Used to pass attribute to view
     * @return String The name of view to be rendered
     */
    @GetMapping("/data")
    public String sum(@RequestParam(name = "number", required = false) Long number, Model model) {
        try {

            if (number == null) {
                model.addAttribute("message", "Lack of Parameter");
            } else {
                /**
                 * Break the expression into multiple steps to check for overflow at each stage of the calculation.
                 */
                long first = 1L;
                long last = number;
                long n = number;
                long firstAddLast = Math.addExact(first, last);
                long multiply = Math.multiplyExact(firstAddLast, n);
                long sum = multiply / 2;
                model.addAttribute("sum", sum);
            }
        } catch (ArithmeticException ex) {
            model.addAttribute("message", "Sum is too big");
        }

        return "data";
    }

    /**
     * @param model used to pass attribute to view
     * @return The name of the view to be rendered
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleException(Model model) {

        model.addAttribute("message", "Wrong Parameter Type! Please input number");
        return "data";
    }
}
