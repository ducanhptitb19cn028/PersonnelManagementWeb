package dajava.personnelmanagementweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "academic_level")
public class AcademicLevel {
    @Id
    @Column(name = "alid")
    private String alid;
    private String academiclevel;
    private String major;

}
