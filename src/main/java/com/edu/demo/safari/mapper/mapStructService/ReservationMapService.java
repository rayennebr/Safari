package com.edu.demo.safari.mapper.mapStructService;

import com.edu.demo.safari.dto.ReservationDto;
import com.edu.demo.safari.entities.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ReservationMapService {
    void mapReservation(Reservation reservationSource, @MappingTarget Reservation reservation);
}
