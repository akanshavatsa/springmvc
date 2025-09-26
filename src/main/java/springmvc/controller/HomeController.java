package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller

public class HomeController {


    @RequestMapping("/home")
    public  String home(Model model)
    {

        System.out.println("this is home url");
        model.addAttribute("name","akansha");
         model.addAttribute("id",1231);

        List<String> friends = new ArrayList<String>();
        friends.add("asha");
        friends.add("awadhesh");
        friends.add("akshansh");
        friends.add("aman");

        model.addAttribute("f",friends);

        return "index";
    }


    @RequestMapping("/about")
    public  String about()
    {

        System.out.println("this is about page");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help()
    {
        System.out.println("this is help controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user","ak");
        modelAndView.addObject("name","aman");
        modelAndView.addObject("rollnumber","46");
        LocalDateTime now= LocalDateTime.now();
        modelAndView.addObject("time",now);

        List<Integer> list= new ArrayList<Integer>();
        list.add(23);
        list.add(363);
        list.add(473);
        list.add(678);

        modelAndView.addObject("marks",list);




        modelAndView.setViewName("help");
        return  modelAndView;
    }




}
