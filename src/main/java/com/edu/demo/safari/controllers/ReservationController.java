package com.edu.demo.safari.controllers;

import com.edu.demo.safari.dto.ReservationDto;
import com.edu.demo.safari.entities.Reservation;
import com.edu.demo.safari.service.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/reservation")
@CrossOrigin("*")
public class ReservationController {

    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/")
    Reservation addReservation(@RequestBody Reservation reservation)
    {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/")
    List<Reservation> getAllReservation()
    {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{ln}")
    List<ReservationDto> getAllReservationByLanguage(@PathVariable String ln)
    {
        return reservationService.getAllReservationByLanguage(ln);
    }


    @GetMapping("/{userID}/{ln}")
    List<ReservationDto> findAllByUserIDByLanguage(@PathVariable UUID userID,@PathVariable String ln)
    {
        return reservationService.findAllByUserIDByLanguage(userID, ln);
    }
    @GetMapping("{busID}/{ln}")
    List<ReservationDto> findAllByBusIDByLanguage(@PathVariable UUID busID,@PathVariable String ln)
    {
        return reservationService.findAllByBusIDByLanguage(busID, ln);
    }
    @GetMapping("/{userId}/{busId}/{ln}")
    List<ReservationDto> findAllByUserIDAndBusIDByLanguage(@PathVariable UUID userID,@PathVariable UUID busID,@PathVariable String ln)
    {
        return reservationService.findAllByUserIDAndBusIDByLanguage(userID, busID, ln);
    }

    @DeleteMapping("/{reservationId}")
    Reservation deleteReservation(@PathVariable UUID reservationId)
    {
        return reservationService.deleteReservation(reservationId);
    }

}
