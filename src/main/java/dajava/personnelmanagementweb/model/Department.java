package dajava.personnelmanagementweb.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity(name = "department")
public class Department {
    @Id
    @Column(name = "dpid")
    private String dpid;
    private String department;
    private String tel;

}
