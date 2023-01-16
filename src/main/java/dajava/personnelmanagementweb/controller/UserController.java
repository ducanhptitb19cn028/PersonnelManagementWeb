package dajava.personnelmanagementweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class UserController {
    @GetMapping("/login")
    public String loginview(ModelMap modelMap){
        return "login_view/login";
    }
}
