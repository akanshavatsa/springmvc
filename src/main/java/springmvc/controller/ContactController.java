package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonDataForModel(Model m)
    {
        System.out.println("adding common data to model");
        m.addAttribute("Header","Akansha's Project");
        m.addAttribute("Desc","Trying my best");
    }

    @RequestMapping("/contact")
    public String contact(Model m) {


        return "contact";

    }


//    @RequestMapping(path = "/processform", method = RequestMethod.POST)
//    public  String handleForm(@ModelAttribute  User user , Model model)
//    {
//
//        System.out.println(user);
//        return  "success";
//    }

}
//    public String handleForm(
//            @RequestParam("email") String userEmail,
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            Model model)
//    {
//
//
//        User user= new User();
//        user.setEmail(userEmail);
//        user.setUserName(username);
//        user.setPassword(password);
//
//
//
//        System.out.println(user);
//        model.addAttribute("user",user);
////        model.addAttribute("name",username);
////        model.addAttribute("email",userEmail);
////        model.addAttribute("password",password);
//
//
//        return  "success";
//
//    }


//    public  String handleForm(HttpServletRequest request)
//    {
//        String email=request.getParameter("email");
//        System.out.println(email);
//        return "";
//    }


