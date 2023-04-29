package com.example.Ims.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="irrigation_data")
public class IrrigationData {
    @Id
    private Long Id;
    private String timeStamp;
    private String soilMoisture;
    private String soilTemperature;
    private String amountOfWater;
    private String irr_district;
    private String irr_Sector;
    private String irr_Cell;
    private String irr_village;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(String soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public String getSoilTemperature() {
        return soilTemperature;
    }

    public void setSoilTemperature(String soilTemperature) {
        this.soilTemperature = soilTemperature;
    }

    public String getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(String amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public String getIrr_district() {
        return irr_district;
    }

    public void setIrr_district(String irr_district) {
        this.irr_district = irr_district;
    }

    public String getIrr_Sector() {
        return irr_Sector;
    }

    public void setIrr_Sector(String irr_Sector) {
        this.irr_Sector = irr_Sector;
    }

    public String getIrr_Cell() {
        return irr_Cell;
    }

    public void setIrr_Cell(String irr_Cell) {
        this.irr_Cell = irr_Cell;
    }

    public String getIrr_village() {
        return irr_village;
    }

    public void setIrr_village(String irr_village) {
        this.irr_village = irr_village;
    }

    public String getIrr_coop() {
        return irr_coop;
    }

    public void setIrr_coop(String irr_coop) {
        this.irr_coop = irr_coop;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String irr_coop;
    private String time;


    public IrrigationData(Long id, String timeStamp, String soilMoisture, String soilTemperature, String amountOfWater, String irr_district, String irr_Sector, String irr_Cell, String irr_village, String irr_coop, String time) {
        Id = id;
        this.timeStamp = timeStamp;
        this.soilMoisture = soilMoisture;
        this.soilTemperature = soilTemperature;
        this.amountOfWater = amountOfWater;
        this.irr_district = irr_district;
        this.irr_Sector = irr_Sector;
        this.irr_Cell = irr_Cell;
        this.irr_village = irr_village;
        this.irr_coop = irr_coop;
        this.time = time;


    }
}
