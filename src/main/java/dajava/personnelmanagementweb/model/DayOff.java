package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;

@Data
@Entity(name = "day_off")
public class DayOff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doid;
    private Date dayoff;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "employees_day_off",joinColumns = {@JoinColumn(name = "doid",referencedColumnName = "doid")}, inverseJoinColumns = {@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")})
    private Set<Employee> employees;


}
