package com.example.Ims.Controller;

import com.example.Ims.Entity.Cooperatives;
import com.example.Ims.Services.CooperativesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cooperatives")
public class CooperativeController {
    @Autowired
    private CooperativesService service;

    @PostMapping("/saveCooperatives")
    public ResponseEntity<String> saveCooperatives(@RequestBody Cooperatives cooperatives){
        Long coopId = Long.valueOf(service.saveCooperatives(cooperatives));
        //String CoopId = null;
        return  new ResponseEntity<String>("Cooperatives with '"+coopId+"' has been saved", HttpStatus.OK);

    }
    @GetMapping("/CooperativesList")
    public ResponseEntity<List<Cooperatives>> getAllCooperativesDetails(){
        List<Cooperatives> list = service.getAllCooperatives();
        return new ResponseEntity<List<Cooperatives>>(list,HttpStatus.OK);
    }

    @GetMapping("/getCooperativesById/{coopId}")
    public ResponseEntity<Cooperatives> getCooperativesById( @PathVariable("coopId")  Long coopId){
        Cooperatives cp = service.getCooperativesById(coopId);
        return new ResponseEntity<Cooperatives>(cp,HttpStatus.OK);
    }
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

    @DeleteMapping("deleteCooperatives/{coopId}")
    public ResponseEntity<String> deleteCooperatives(@PathVariable("coopId") Long coopId){
        service.deleteCooperatives(coopId);
        String id;
        return new ResponseEntity<String>("Cooperatives with '"+coopId+"' has been deleted",HttpStatus.OK);
    }
}
