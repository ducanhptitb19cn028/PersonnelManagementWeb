package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
