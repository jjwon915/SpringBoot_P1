package helloSpring.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("hello")
    public String welcome(Model model){
        model.addAttribute("data1", "Welcome To my Page! Hello!");
        model.addAttribute("data2", "addAttribute Test");
        return "hello";
    }
}
