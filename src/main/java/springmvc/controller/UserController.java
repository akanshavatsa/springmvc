package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.service.IUserService;
import springmvc.service.UserServiceImpl;
import springmvc.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    IUserService userService;

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public  String handleForm(@ModelAttribute User user )
    {
//controller talks with service always
        System.out.println(user);
       userService.saveUser(user);
        return  "success";
    }
}
