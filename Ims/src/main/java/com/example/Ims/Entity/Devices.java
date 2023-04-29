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
@Table(name="devices")
public class Devices {
    @Id
   // @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long devId;
    @Column(name = "Name")
    private String devName;
    @Column(name = "Holder")
    private String devHolder;
    @Column(name = "District")
    private String devDistrict;
    @Column(name = "Sector")
    private String devSector;
    @Column(name = "Cell")
    private String devCell;
    @Column(name = "Village")
    private String Village;
    @ManyToOne
    @JoinColumn(name = "coopName")
    private Cooperatives cooperatives;

    public Devices(Long devId, String devName, String devHolder, String devDistrict, String devSector, String devCell, String village, Cooperatives cooperatives) {
        this.devId = devId;
        this.devName = devName;
        this.devHolder = devHolder;
        this.devDistrict = devDistrict;
        this.devSector = devSector;
        this.devCell = devCell;
        Village = village;
        this.cooperatives = cooperatives;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevHolder() {
        return devHolder;
    }

    public void setDevHolder(String devHolder) {
        this.devHolder = devHolder;
    }

    public String getDevDistrict() {
        return devDistrict;
    }

    public void setDevDistrict(String devDistrict) {
        this.devDistrict = devDistrict;
    }

    public String getDevSector() {
        return devSector;
    }

    public void setDevSector(String devSector) {
        this.devSector = devSector;
    }

    public String getDevCell() {
        return devCell;
    }

    public void setDevCell(String devCell) {
        this.devCell = devCell;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public Cooperatives getCooperatives() {
        return cooperatives;
    }

    public void setCooperatives(Cooperatives cooperatives) {
        this.cooperatives = cooperatives;
    }
}

