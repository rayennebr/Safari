package com.edu.demo.safari.mapper;

import com.edu.demo.safari.dto.BusDto;
import com.edu.demo.safari.entities.Bus;
import org.springframework.stereotype.Component;

@Component
public class BusMapper {

    public BusDto mapBus(Bus bus,String ln)
    {
        return BusDto.builder()
                .busID(bus.getBusID())
                .busName(bus.getBusName().getContent().get(ln))
                .busType(bus.getBusType().getContent().get(ln))
                .arrivalDate(bus.getArrivalDate())
                .availableSeat(bus.getAvailableSeat())
                .driverName(bus.getDriverName().getContent().get(ln))
                .departureDate(bus.getDepartureDate())
                .routeForm(bus.getRouteForm().getContent().get(ln))
                .build();
    }
}
