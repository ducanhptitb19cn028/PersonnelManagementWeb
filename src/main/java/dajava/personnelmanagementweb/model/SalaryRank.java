package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name = "salary_rank")
public class SalaryRank {
    @Id
    @Column(name = "salid")
    private int salid;
    @Column(name = "allowance")
    private int allowance;
    @Column(name = "basic_salary")
    private int basic_salary;
}
