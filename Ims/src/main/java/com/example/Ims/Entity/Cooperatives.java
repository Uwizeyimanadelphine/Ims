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
@Table(name="cooperatives")
public class Cooperatives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long coopId;
    @Column(name = "Name")
    private String coopName;
    @Column(name = "District")
    private String coopDistrict;
    @Column(name = "Sector")
    private String coopSector;
    @Column(name = "Cell")
    private String coopCell;
    @Column(name = "Village")
    private String coopVillage;
    @Column(name = "Email")
    private String coopEmail;
    @Column(name = "Tin")
    private Integer coopTin;

    public Cooperatives(Long coopId, String coopName, String coopDistrict, String coopSector, String coopCell, String coopVillage, String coopEmail, Integer coopTin) {
        this.coopId = coopId;
        this.coopName = coopName;
        this.coopDistrict = coopDistrict;
        this.coopSector = coopSector;
        this.coopCell = coopCell;
        this.coopVillage = coopVillage;
        this.coopEmail = coopEmail;
        this.coopTin = coopTin;
    }

    public Long getCoopId() {
        return coopId;
    }

    public void setCoopId(Long coopId) {
        this.coopId = coopId;
    }

    public String getCoopName() {
        return coopName;
    }

    public void setCoopName(String coopName) {
        this.coopName = coopName;
    }

    public String getCoopDistrict() {
        return coopDistrict;
    }

    public void setCoopDistrict(String coopDistrict) {
        this.coopDistrict = coopDistrict;
    }

    public String getCoopSector() {
        return coopSector;
    }

    public void setCoopSector(String coopSector) {
        this.coopSector = coopSector;
    }

    public String getCoopCell() {
        return coopCell;
    }

    public void setCoopCell(String coopCell) {
        this.coopCell = coopCell;
    }

    public String getCoopVillage() {
        return coopVillage;
    }

    public void setCoopVillage(String coopVillage) {
        this.coopVillage = coopVillage;
    }

    public String getCoopEmail() {
        return coopEmail;
    }

    public void setCoopEmail(String coopEmail) {
        this.coopEmail = coopEmail;
    }

    public Integer getCoopTin() {
        return coopTin;
    }

    public void setCoopTin(Integer coopTin) {
        this.coopTin = coopTin;
    }
}
