package neeraj.springboot.controllers;

import neeraj.springboot.models.Login;
import neeraj.springboot.services.LoginServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginServices loginServices;

    public LoginController(LoginServices loginServices) {
        this.loginServices = loginServices;
    }

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    @PostMapping("/login")
    public String saveLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        Login login = new Login(username,password);
        model.addAttribute("obj",loginServices.save(login));
        return "success.html";
    }
}
