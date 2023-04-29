package com.example.Ims.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="agronomist")
public class Agronomist {
    @Id
    @Column(name = "Id")
    private Long agroId;
    @Column(name = "First Name")
    private String agroFname;
    @Column(name = "Last Name")
    private String agroLname;
    @Column(name = "Email")
    private String agroEmail;
    @Column(name = "Tel")
    private String agroTel;
    @ManyToOne
    @JoinColumn(name = "Cooperative Name")
    private Cooperatives cooperatives;

    public Agronomist(Long agroId, String agroFname, String agroLname, String agroEmail, String agroTel, Cooperatives cooperatives) {
        this.agroId = agroId;
        this.agroFname = agroFname;
        this.agroLname = agroLname;
        this.agroEmail = agroEmail;
        this.agroTel = agroTel;
        this.cooperatives = cooperatives;
    }

    public Long getAgroId() {
        return agroId;
    }

    public void setAgroId(Long agroId) {
        this.agroId = agroId;
    }

    public String getAgroFname() {
        return agroFname;
    }

    public void setAgroFname(String agroFname) {
        this.agroFname = agroFname;
    }

    public String getAgroLname() {
        return agroLname;
    }

    public void setAgroLname(String agroLname) {
        this.agroLname = agroLname;
    }

    public String getAgroEmail() {
        return agroEmail;
    }

    public void setAgroEmail(String agroEmail) {
        this.agroEmail = agroEmail;
    }

    public String getAgroTel() {
        return agroTel;
    }

    public void setAgroTel(String agroTel) {
        this.agroTel = agroTel;
    }

    public Cooperatives getCooperatives() {
        return cooperatives;
    }

    public void setCooperatives(Cooperatives cooperatives) {
        this.cooperatives = cooperatives;
    }
}
