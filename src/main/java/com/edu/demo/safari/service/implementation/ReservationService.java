package com.edu.demo.safari.service.implementation;

import com.edu.demo.safari.dto.ReservationDto;
import com.edu.demo.safari.entities.Reservation;
import com.edu.demo.safari.mapper.ReservationMapper;
import com.edu.demo.safari.mapper.mapStructService.ReservationMapService;
import com.edu.demo.safari.repositories.ReservationRepository;
import com.edu.demo.safari.service.IReservationService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class ReservationService implements IReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;
    private final ReservationMapService reservationMapService;

    public ReservationService(ReservationRepository reservationRepository, ReservationMapper reservationMapper, ReservationMapService reservationMapService) {
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.reservationMapService = reservationMapService;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(UUID reservationId, Reservation reservation) {
        var updatedReservation =reservationRepository.findById(reservationId)
                .orElseThrow(()->new NoSuchElementException("résérvation n'existe pas"));
        reservationMapService.mapReservation(reservation,updatedReservation);
        return reservationRepository.saveAndFlush(updatedReservation);
    }

    @Override
    public Reservation deleteReservation(UUID reservationId) {
        var deletedReservation =reservationRepository.findById(reservationId)
                .orElseThrow(()->new NoSuchElementException("résérvation n'existe pas"));
        reservationRepository.delete(deletedReservation);
        return deletedReservation;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public List<ReservationDto> getAllReservationByLanguage(String ln) {
        return reservationRepository.findAll()
                .stream()
                .map(reservation -> this.reservationMapper.mapToReservationDto(reservation,ln))
                .toList();
    }

    @Override
    public List<ReservationDto> findAllByUserIDByLanguage(UUID userID, String ln) {
        return reservationRepository.findAllByUserID(userID)
                .stream()
                .map(reservation -> this.reservationMapper.mapToReservationDto(reservation,ln))
                .toList();
    }

    @Override
    public List<ReservationDto> findAllByBusIDByLanguage(UUID busID, String ln) {
        return reservationRepository.findAllByBusID(busID)
                .stream()
                .map(reservation -> this.reservationMapper.mapToReservationDto(reservation,ln))
                .toList();
    }

    @Override
    public List<ReservationDto> findAllByUserIDAndBusIDByLanguage(UUID userID, UUID busID, String ln) {
        return reservationRepository.findAllByUserIDAndBusID(userID,busID)
                .stream()
                .map(reservation -> this.reservationMapper.mapToReservationDto(reservation,ln))
                .toList();
    }
}
