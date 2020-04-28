package neeraj.springboot.controllers;

import neeraj.springboot.models.Login;
import neeraj.springboot.services.LoginServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final LoginServices loginServices;

    public LoginController(LoginServices loginServices) {
        this.loginServices = loginServices;
    }

    @PostMapping("/login")
    public Login saveLogin(@RequestBody Login login){
        return loginServices.save(login);
    }
}
