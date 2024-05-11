package com.edu.demo.safari.controllers;

import com.edu.demo.safari.dto.BusDto;
import com.edu.demo.safari.entities.Bus;
import com.edu.demo.safari.service.IBusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/bus")
@CrossOrigin("*")
public class BusController {

    private final IBusService busService;

    public BusController(IBusService busService) {
        this.busService = busService;
    }

    @PostMapping("/")
    Bus addBus(@RequestBody Bus bus)
    {
        return busService.addBus(bus);
    }

    @GetMapping("/")
    List<Bus> getAllBus()
    {
        return busService.getAllBus();
    }

    @GetMapping("/{routeId}/{ln}")
    List<BusDto> findAllByRouteID(@PathVariable UUID routeId, @PathVariable String ln)
    {
        return busService.findAllByRouteID(routeId, ln);
    }

    @PutMapping("/{busId}")
    Bus updateBus(@PathVariable UUID busId,@RequestBody Bus bus)
    {
        return busService.updateBus(bus,busId);
    }

    @DeleteMapping("/{busId}")
    Bus deleteBus(@PathVariable UUID busId)
    {
        return busService.deleteBus(busId);
    }
}
