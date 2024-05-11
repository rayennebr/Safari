package com.edu.demo.safari.mapper;

import com.edu.demo.safari.dto.ReservationDto;
import com.edu.demo.safari.entities.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public ReservationDto mapToReservationDto(Reservation reservation,String ln)
    {
        return ReservationDto.builder()
                .reservationID(reservation.getReservationID())
                .userID(reservation.getUserID())
                .date(reservation.getDate())
                .destination(reservation.getDestination().getContent().get(ln))
                .source(reservation.getSource().getContent().get(ln))
                .status(reservation.getStatus().getContent().get(ln))
                .busID(reservation.getBusID())
                .build();
    }
}
