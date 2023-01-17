package dajava.personnelmanagementweb.service;

import dajava.personnelmanagementweb.dto.UserRegistrationDTO;
import dajava.personnelmanagementweb.model.User;

public interface UserService {
    User save(UserRegistrationDTO registrationDto);
}
