package com.example.Ims.Services;

import com.example.Ims.Entity.Devices;
import com.example.Ims.Repository.DevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicesServiceImp implements DevicesService {

    @Autowired
    private DevicesRepository repository;

    @Override
    public Long saveDevices(Devices devices) {
        return repository.save(devices).getDevId();
    }

    @Override
    public List<Devices> getAllDevices() {
        return (List<Devices>) repository.findAll();
    }

    @Override
    public Devices getDevicesById(Long devId) {
        return repository.findById(Math.toIntExact(devId)).get();
    }

    @Override
    public void deleteDevices(Long devId) {
        repository.deleteById(Math.toIntExact(devId));
    }
}
