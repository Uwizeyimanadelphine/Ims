package com.example.Ims.Controller;

import com.example.Ims.Entity.Agronomist;
import com.example.Ims.Entity.Managers;
import com.example.Ims.Services.AgronomistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/Agronomist")
public class AgronomistController {

        @Autowired
        private AgronomistService service;

        @PostMapping("/saveAgronomist")
        public ResponseEntity<String> saveAgronomist(@RequestBody Agronomist agronomist){
            Long agroId = Long.valueOf(service.saveAgronomist(agronomist));
            //String CoopId = null;
            return  new ResponseEntity<String>("Agronomist with '"+agroId+"' has been saved", HttpStatus.OK);

        }
        @GetMapping("/AgronomistList")
        public ResponseEntity<List<Agronomist>> getAllAgronomistDetails(){
            List<Agronomist> list = service.getAllAgronomist();
            return new ResponseEntity<List<Agronomist>>(list,HttpStatus.OK);
        }

        @GetMapping("/getAgronomistById/{agroId}")
        public ResponseEntity<Agronomist> getAgronomistById( @PathVariable("agroId")  Long agroId){
            Agronomist agro = service.getAgronomistById(agroId);
            return new ResponseEntity<Agronomist>(agro,HttpStatus.OK);
        }


        @PutMapping("/updateAgronomist/{agroId}")
        public ResponseEntity<String> updateAgronomist( @PathVariable("agroId") Long agroId,  @RequestBody Agronomist agronomist){
            Agronomist agroFromDb = service.getAgronomistById(agroId);
            agroFromDb.setAgroId(agronomist.getAgroId());
            agroFromDb.setAgroFname(agronomist.getAgroFname());
            agroFromDb.setAgroLname(agronomist.getAgroLname());
            agroFromDb.setAgroEmail(agronomist.getAgroEmail());
            agroFromDb.setAgroTel(agronomist.getAgroTel());
            agroFromDb.setCooperatives(agronomist.getCooperatives());
            Long id = Long.valueOf(service.saveAgronomist(agronomist));
            return new ResponseEntity<String>("Agronomist with '"+agroId+"' has been updated",HttpStatus.OK);

        }

        @DeleteMapping("deleteAgronomist/{agroId}")
        public ResponseEntity<String> deleteAgronomist(@PathVariable("agroId") Long agroId){
            service.deleteAgronomist(agroId);
            String id;
            return new ResponseEntity<String>("Agronomist with '"+agroId+"' has been deleted",HttpStatus.OK);
        }
    }


