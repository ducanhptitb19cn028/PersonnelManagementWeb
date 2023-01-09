package dajava.personnelmanagementweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity(name = "labour_contract")
public class LabourContract {
    @Id
    private String contractId;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private String contractType;
    private Date startDate;
    private Date endDate;

    public LabourContract() {}
}
