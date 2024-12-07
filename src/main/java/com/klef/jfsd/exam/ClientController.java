package com.klef.jfsd.exam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @RequestMapping("/greet")
    public ModelAndView greetUser(@RequestParam("username") String username) {
        return new ModelAndView("greet", "message", "Hello, " + username + "!");
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/demo1")
    public ModelAndView demo1(@RequestParam("age") int age, @RequestParam("country") String country) {
        ModelAndView mv = new ModelAndView("demo1");
        mv.addObject("age", age);
        mv.addObject("country", country);
        return mv;
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public ModelAndView arithmetic(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        ModelAndView mv = new ModelAndView("demo2");
        mv.addObject("subtraction", num1 - num2);
        mv.addObject("division", num1 / num2);
        return mv;
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public ModelAndView multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        return new ModelAndView("multiplyNumbers", "result", result);
    }

    @RequestMapping("/reverse")
    public ModelAndView reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        String reversed1 = new StringBuilder(str1).reverse().toString();
        String reversed2 = new StringBuilder(str2).reverse().toString();
        ModelAndView mv = new ModelAndView("reverse");
        mv.addObject("reversed1", reversed1);
        mv.addObject("reversed2", reversed2);
        return mv;
    }

    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        ModelAndView mv = new ModelAndView("calculate");
        mv.addObject("addition", num1 + num2);
        mv.addObject("subtraction", num1 - num2);
        return mv;
    }
}
