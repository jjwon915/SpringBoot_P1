package helloSpring.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @GetMapping("hello")
    public String welcome(Model model){
        model.addAttribute("data1", "Welcome To my Page! Hello!");
        model.addAttribute("data2", "addAttribute Test");
        return "hello";
    }

    @GetMapping("hi")
    public String helloMvc(@RequestParam(value = "name", defaultValue = "hong gil-dong") String name,
                           @RequestParam(value = "age", defaultValue = "99") String age,
                           Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "info";
    }

    @GetMapping("test-api")
    @ResponseBody
    public Hello hello(@RequestParam("name") String name, @RequestParam("program") String program){
        Hello hello = new Hello();
        hello.setName(name);
        hello.setProgram(program);
        return hello;
    }

    static class Hello{
        private String name;
        private String program;

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
