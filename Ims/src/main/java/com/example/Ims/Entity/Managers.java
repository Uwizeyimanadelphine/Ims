package com.example.Ims.Entity;

import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="Manager")
public class Managers  {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long manId;
    @Column(name = "Fist Name")
    private String manFname;
    @Column(name = "Last Name")
    private String manLname;
    @Column(name = "Email")
    private String manEmail;
    @Column(name = "Tel")
    private String manTel;

    @ManyToOne
    @JoinColumn(name = "coopName")
    private Cooperatives cooperatives;

    public Managers(Long manId, String manFname, String manLname, String manEmail, String manTel, Cooperatives cooperatives) {
        this.manId = manId;
        this.manFname = manFname;
        this.manLname = manLname;
        this.manEmail = manEmail;
        this.manTel = manTel;
        this.cooperatives = cooperatives;
    }

    public Long getManId() {
        return manId;
    }

    public void setManId(Long manId) {
        this.manId = manId;
    }

    public String getManFname() {
        return manFname;
    }

    public void setManFname(String manFname) {
        this.manFname = manFname;
    }

    public String getManLname() {
        return manLname;
    }

    public void setManLname(String manLname) {
        this.manLname = manLname;
    }

    public String getManEmail() {
        return manEmail;
    }

    public void setManEmail(String manEmail) {
        this.manEmail = manEmail;
    }

    public String getManTel() {
        return manTel;
    }

    public void setManTel(String manTel) {
        this.manTel = manTel;
    }

    public Cooperatives getCooperatives() {
        return cooperatives;
    }

    public void setCooperatives(Cooperatives cooperatives) {
        this.cooperatives = cooperatives;
    }
}
