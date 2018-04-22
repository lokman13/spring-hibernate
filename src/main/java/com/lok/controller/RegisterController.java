package com.lok.controller;

import com.lok.entity.RegisterBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

     private RegisterBean registerBean;

     @RequestMapping(value = "/register",method = RequestMethod.GET)
public String init(Model model){
         model.addAttribute("msg","Enter votre information");
                 return "register";
     }

    @RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
    public String registerSuccess(@RequestParam(name = "fullname") String fullname, @RequestParam(name = "email") String email,@RequestParam(name = "username") String username , @RequestParam(name = "password") String password ){
        RegisterBean registerBean = new RegisterBean(fullname,email,username,password);
        return "home";
}
}
