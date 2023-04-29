package com.example.Ims.Services;

import com.example.Ims.Entity.Devices;
import java.util.List;

public interface DevicesService {
    Long saveDevices(Devices devices);

    List<Devices> getAllDevices();

    Devices getDevicesById(Long devId);

    //public Long saveDevices(Devices devices);

    public void deleteDevices(Long devId);
}
