package neeraj.springboot.repo;

import neeraj.springboot.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,String> {
}
