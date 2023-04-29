package com.example.Ims.Services;

import com.example.Ims.Entity.Managers;
import com.example.Ims.Repository.ManagerRepository;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImp implements ManagerService {

        @Autowired
        private ManagerRepository repository;

    @Override
    public Long saveManagers(Managers managers) {
        return repository.save(managers).getManId();
    }

    @Override
    public List<Managers> getAllManagers() {
        return (List<Managers>) repository.findAll();
    }

        @Override
        public Managers getManagersById(Long manId) {
            return (Managers) repository.findById(Math.toIntExact(manId)).get();
        }

        @Override
        public void deleteManagers(Long manId) {
            repository.deleteById(Math.toIntExact(manId));
        }
    }
