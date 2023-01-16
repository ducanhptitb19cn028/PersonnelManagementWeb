package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    boolean Login(String username,String password);
    User getUser(String username,String password);
    boolean Register(User user);
    User ChangePassword(String username,String password);
    boolean AddUser(User user);
}
