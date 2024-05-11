package com.edu.demo.safari.service.implementation;

import com.edu.demo.safari.dto.BusDto;
import com.edu.demo.safari.entities.Bus;
import com.edu.demo.safari.mapper.BusMapper;
import com.edu.demo.safari.mapper.mapStructService.BusMapService;
import com.edu.demo.safari.repositories.BusRepository;
import com.edu.demo.safari.service.IBusService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class BusService implements IBusService {

    private final BusRepository busRepository;
    private final BusMapper busMapper;
    private final BusMapService busMapService;

    public BusService(BusRepository busRepository, BusMapper busMapper, BusMapService busMapService) {
        this.busRepository = busRepository;
        this.busMapper = busMapper;
        this.busMapService = busMapService;
    }

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public Bus updateBus(Bus bus, UUID busID) {
        Bus updatedBus=busRepository.findById(busID).orElseThrow(()->new NoSuchElementException("bus n'existe pas"));
        busMapService.mapToBus(bus,updatedBus);
        busRepository.saveAndFlush(updatedBus);
        return updatedBus;
    }

    @Override
    public Bus deleteBus(UUID busID) {
        Bus bus=busRepository.findById(busID).orElseThrow(()->new NoSuchElementException("bus n'existe pas"));
        busRepository.delete(bus);
        return bus;
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }

    @Override
    public List<BusDto> findAllByRouteID(UUID routeId, String ln) {
        return busRepository.findAllByRouteID(routeId)
                .stream()
                .map(bus->this.busMapper.mapBus(bus,ln))
                .toList();
    }
}
