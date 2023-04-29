package com.example.Ims.Services;

import com.example.Ims.Entity.Cooperatives;

import java.util.List;

public interface CooperativesService {
    Long saveCooperative(Cooperatives cooperatives);

    List<Cooperatives> getAllCooperatives();

    Cooperatives getCooperativesById(Long coopId);

    public Long saveCooperatives(Cooperatives cooperatives);

    public void deleteCooperatives(Long coopId);

}
