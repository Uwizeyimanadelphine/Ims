package com.example.Ims.Controller;

import com.example.Ims.Entity.Cooperatives;
import com.example.Ims.Entity.Devices;
import com.example.Ims.Services.CooperativesService;
import com.example.Ims.Services.DevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/devices")
public class DevicesController {

    @Autowired
    private DevicesService service;
    @PostMapping("/saveDevices")
    public ResponseEntity<String> saveDevices(@RequestBody Devices devices) {
        Long devId = Long.valueOf(service.saveDevices(devices));
        return new ResponseEntity<String>("Device with '" + devId + "' has been saved", HttpStatus.OK);
    }

    @GetMapping("/DevicesList")
    public ResponseEntity<List<Devices>> getAllDevicesDetails(){
        List<Devices> list = service.getAllDevices();
        return new ResponseEntity<List<Devices>>(list,HttpStatus.OK);
    }
    @GetMapping("/getDevicesById/{devId}")
    public ResponseEntity<Devices> getDevicesById( @PathVariable("devId")  Long devId){
        Devices dv = service.getDevicesById(devId);
        return new ResponseEntity<Devices>(dv,HttpStatus.OK);
    }
    /*
    @PutMapping("/updateCooperatives/{coopId}")
    public ResponseEntity<String> updateCooperatives( @PathVariable("coopId") Long coopId,  @RequestBody Cooperatives cooperatives){
        Cooperatives cpFromDb = service.getCooperativesById(coopId);
        cpFromDb.setCoopId(cooperatives.getCoopId());
        cpFromDb.setCoopName(cooperatives.getCoopName());
        cpFromDb.setCoopDistrict(cooperatives.getCoopDistrict());
        cpFromDb.setCoopSector(cooperatives.getCoopSector());
        cpFromDb.setCoopCell(cooperatives.getCoopCell());
        cpFromDb.setCoopVillage(cooperatives.getCoopVillage());
        cpFromDb.setCoopEmail(cooperatives.getCoopEmail());
        cpFromDb.setCoopTin(cooperatives.getCoopTin());
        // Long id = service.saveCooperative(cpFromDb);
        Long id = Long.valueOf(service.saveCooperatives(cooperatives));
        return new ResponseEntity<String>("cooperative with '"+coopId+"' has been updated",HttpStatus.OK);

    }
 */
    @DeleteMapping("deleteDevices/{devId}")
    public ResponseEntity<String> deleteDevices(@PathVariable("devId") Long devId){
        service.deleteDevices(devId);
        String id;
        return new ResponseEntity<String>("Devices with '"+devId+"' has been deleted",HttpStatus.OK);
    }

}
