package dajava.personnelmanagementweb.model;

import jakarta.persistence.*;

@Entity(name = "salary_rank")
public class SalaryRank {
    @Id
    @Column(name = "salid")
    private int salid;
    @Column(name = "allowance")
    private int allowance;
    @Column(name = "basic_salary")
    private int basic_salary;

    public int getSalid() {
        return salid;
    }

    public void setSalid(int salid) {
        this.salid = salid;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(int basic_salary) {
        this.basic_salary = basic_salary;
    }
}
