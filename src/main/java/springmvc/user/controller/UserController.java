package springmvc.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage()
    {
        System.out.println("vghfghvghcghchgc");
        return "login";
    }

    @GetMapping({"/", "/home"})
    public  String homePage()
    {
        return "home";
    }
}
