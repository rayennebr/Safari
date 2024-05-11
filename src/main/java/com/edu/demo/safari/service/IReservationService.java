package com.edu.demo.safari.service;

import com.edu.demo.safari.dto.ReservationDto;
import com.edu.demo.safari.entities.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IReservationService {

    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(UUID reservationId,Reservation reservation);
    Reservation deleteReservation(UUID reservationId);
    List<Reservation> getAllReservations();
    List<ReservationDto> getAllReservationByLanguage(String ln);

    List<ReservationDto> findAllByUserIDByLanguage(UUID userID,String ln);
    List<ReservationDto> findAllByBusIDByLanguage(UUID busID,String ln);
    List<ReservationDto> findAllByUserIDAndBusIDByLanguage(UUID userID,UUID busID,String ln);
}
