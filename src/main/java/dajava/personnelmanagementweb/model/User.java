package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "user")
public class User {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @Column(name = "role")
    private String role;
}
