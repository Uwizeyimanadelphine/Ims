package com.example.Ims.Services;

import com.example.Ims.Entity.Agronomist;
import com.example.Ims.Repository.AgronomistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgronomistServiceImp implements AgronomistService{
    @Autowired
    private AgronomistRepository repository;

    @Override
    public Long saveAgronomist(Agronomist agronomist) {

        return repository.save(agronomist).getAgroId();
    }


    @Override
    public List<Agronomist> getAllAgronomist() {
        return (List<Agronomist>) repository.findAll();
    }

    @Override
    public Agronomist getAgronomistById(Long agroId) {
        return repository.findById(Math.toIntExact(agroId)).get();
    }

    @Override
    public void deleteAgronomist(Long agroId) {
        repository.deleteById(Math.toIntExact(agroId));
    }
}
