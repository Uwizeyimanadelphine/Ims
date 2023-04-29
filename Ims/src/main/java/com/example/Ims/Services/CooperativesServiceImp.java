package com.example.Ims.Services;

import com.example.Ims.Entity.Cooperatives;
import com.example.Ims.Repository.CooperativesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

 public class CooperativesServiceImp implements CooperativesService {

    @Autowired
    private CooperativesRepository repository;

    @Override
    public Long saveCooperatives(Cooperatives cooperatives) {
        return repository.save(cooperatives).getCoopId();
    }


    @Override
    public Long saveCooperative(Cooperatives cooperatives) {
        return null;
    }

    @Override
    public List<Cooperatives> getAllCooperatives() {
        return (List<Cooperatives>) repository.findAll();
    }

    @Override
    public Cooperatives getCooperativesById(Long coopId) {
        return repository.findById(Math.toIntExact(coopId)).get();
    }

    @Override
    public void deleteCooperatives(Long coopId) {
        repository.deleteById(Math.toIntExact(coopId));
    }
}