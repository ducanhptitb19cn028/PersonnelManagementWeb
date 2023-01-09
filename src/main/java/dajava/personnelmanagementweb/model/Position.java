package dajava.personnelmanagementweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "position")
public class Position {
    @Id
    @Column(name = "posid")
    private String posid;
    @Column(name = "pos")
    private String pos;
    @Column(name = "position_des")
    private String positiondescription;
}
