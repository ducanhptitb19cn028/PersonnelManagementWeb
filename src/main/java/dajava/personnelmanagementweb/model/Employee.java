package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.Set;
@Data
@Entity
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private Date dob;
    private String address;
    private String genderOption;
    private String peopleOption;
    @Column(name = "identity_no")
    private String identityno;
    private byte[] images;

    @OneToOne
    @JoinColumn(name = "dpid")
    private Department department;

    @OneToOne
    @JoinColumn(name = "posid")
    private Position position;
    @OneToOne
    @JoinColumn(name = "salid")
    private SalaryRank salaryRank;
    @OneToOne
    @JoinColumn(name = "alid")
    private AcademicLevel academicLevel;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "employees_day_off", joinColumns = {@JoinColumn(name = "employee_id",referencedColumnName = "employee_id")},inverseJoinColumns = {@JoinColumn(name = "doid",referencedColumnName = "doid")})
    Set<DayOff> dayOffs;

    public Employee() {

    }
}
