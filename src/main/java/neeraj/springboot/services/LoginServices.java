package neeraj.springboot.services;

import neeraj.springboot.models.Login;
import neeraj.springboot.repo.LoginRepo;
import org.springframework.stereotype.Service;

@Service
public class LoginServices {
    private final LoginRepo loginRepo;

    public LoginServices(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    public Login save(Login login){
        return loginRepo.save(login);
    }
}
