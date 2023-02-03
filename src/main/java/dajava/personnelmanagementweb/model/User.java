package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Collection;
@Data
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name="employee_id")
    Employee employee;

    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "employee_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

}
