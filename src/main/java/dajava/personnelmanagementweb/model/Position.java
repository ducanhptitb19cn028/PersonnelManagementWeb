package dajava.personnelmanagementweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "position")
public class Position {
    @Id
    @Column(name = "posid")
    private String posid;
    @Column(name = "pos")
    private String pos;
    @Column(name = "position_des")
    private String positiondescription;

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPositiondescription() {
        return positiondescription;
    }

    public void setPositiondescription(String positiondescription) {
        this.positiondescription = positiondescription;
    }
}
