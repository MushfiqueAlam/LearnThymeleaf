package com.thymeleaf.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class MyContoller {
    @RequestMapping(value = "/about",method= RequestMethod.GET)
    public String about(Model model){
        System.out.println("Inside about handler");
        model.addAttribute("name","Mushfique Alam");
        model.addAttribute("currentDate",new Date().toLocaleString());
        return "about";
    }
    //Iteration Handler
    @GetMapping("/loop-iterator")
    public String  iterateHandler(Model m){
        //List of Collection.
       List<String>names= List.of("Mushfique","Amir","Yaseen","Rakib","Ather");
       m.addAttribute("names",names);
        return "iterate";
    }
    //Handler for conditional statement
    @GetMapping("/condition")
    public  String conditionHandler(Model m){
        m.addAttribute("isActive",true);
        m.addAttribute("gender","F");

        List<Integer>list=List.of(1,2,3,4,5,6);
        m.addAttribute("mylist",list);
        return "condition";
    }

//    Handling for including fragment
    @GetMapping("/service")
    public String serviceHandler(Model m){
        m.addAttribute("title","I like to it Samosa");
        m.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";
    }

    //for new about
    @GetMapping("/new-about")
    public String newAbout(Model m){
        return "aboutnew";
    }

    @GetMapping("/contact")
    public String contactHandler(Model m){
        return "contact";
    }
}
