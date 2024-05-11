package com.edu.demo.safari.service;

import com.edu.demo.safari.dto.BusDto;
import com.edu.demo.safari.entities.Bus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IBusService {

    Bus addBus(Bus bus);
    Bus updateBus(Bus bus,UUID busID);
    Bus deleteBus(UUID busID);
    List<Bus> getAllBus();
    List<BusDto> findAllByRouteID(UUID routeId, String ln);
}
