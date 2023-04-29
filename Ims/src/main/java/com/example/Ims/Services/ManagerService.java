package com.example.Ims.Services;

import com.example.Ims.Entity.Managers;
import org.apache.catalina.Manager;

import java.util.List;

public interface ManagerService {


    Long saveManagers(Managers managers);

    List<Managers> getAllManagers();

   Managers getManagersById(Long manId);

    //public Long saveManagers(Cooperatives cooperatives);

    public void deleteManagers(Long manId);

}

