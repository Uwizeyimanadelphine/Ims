package com.example.Ims.Services;

import com.example.Ims.Entity.Agronomist;
import com.example.Ims.Entity.Cooperatives;

import java.util.List;

public interface AgronomistService {

    Long saveAgronomist(Agronomist agronomist);

    List<Agronomist> getAllAgronomist();

    Agronomist getAgronomistById(Long agroId);

   // public Long saveCooperatives(Cooperatives cooperatives);

    public void deleteAgronomist(Long agroId);

}

