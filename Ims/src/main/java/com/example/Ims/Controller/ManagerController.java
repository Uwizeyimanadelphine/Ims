package com.example.Ims.Controller;

import com.example.Ims.Entity.Cooperatives;
import com.example.Ims.Entity.Managers;
import com.example.Ims.Services.CooperativesService;
import com.example.Ims.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Managers")
public class ManagerController {
    @Autowired
    private ManagerService service;

    @PostMapping("/saveManager")
    public ResponseEntity<String> saveManager(@RequestBody Managers managers){
        Long manId = Long.valueOf(service.saveManagers(managers));
        //String CoopId = null;
        return  new ResponseEntity<String>("Manager with '"+manId+"' has been saved", HttpStatus.OK);

    }
    @GetMapping("/ManagersList")
    public ResponseEntity<List<Managers>> getAllManagersDetails(){
        List<Managers> list = service.getAllManagers();
        return new ResponseEntity<List<Managers>>(list,HttpStatus.OK);
    }

    @GetMapping("/getManagersById/{manId}")
    public ResponseEntity<Managers> getManagersById( @PathVariable("manId")  Long manId){
        Managers mn = service.getManagersById(manId);
        return new ResponseEntity<Managers>(mn,HttpStatus.OK);
    }

    @PutMapping("/updateManager/{manId}")
    public ResponseEntity<String> updateManagers( @PathVariable("manId") Long manId,  @RequestBody Managers managers){
        Managers manFromDb = service.getManagersById(manId);
        manFromDb.setManId(managers.getManId());
        manFromDb.setManFname(managers.getManFname());
        manFromDb.setManLname(managers.getManLname());
        manFromDb.setManEmail(managers.getManEmail());
        manFromDb.setManTel(managers.getManTel());
        manFromDb.setCooperatives(managers.getCooperatives());
        Long id = Long.valueOf(service.saveManagers(managers));
        return new ResponseEntity<String>("Manager with '"+manId+"' has been updated",HttpStatus.OK);

    }


    @DeleteMapping("deleteManager/{manId}")
    public ResponseEntity<String> deleteManagers(@PathVariable("manId") Long manId){
        service.deleteManagers(manId);
        String id;
        return new ResponseEntity<String>("Manager with '"+manId+"' has been deleted",HttpStatus.OK);
    }
}

