package com.lok.controller;
import com.lok.entity.LoginBean;
import com.lok.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import java.util.Map;
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
   public LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(Map model) {
        LoginBean loginBean = new LoginBean();
        model.put("login", loginBean);
        return "login";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@Valid LoginBean loginBean, BindingResult result,
                              Map model) {
        if (result.hasErrors()) {
            return "login";
        }
        boolean userExists = loginService.checkLogin(loginBean.getUserName(),loginBean.getPassword());
        if(userExists){
            model.put("login", loginBean);
            return "loginsuccess";
        }else{
            result.rejectValue("userName","invaliduser");
            return "login";
        }
    }
    }