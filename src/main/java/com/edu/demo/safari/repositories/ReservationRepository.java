package com.edu.demo.safari.repositories;

import com.edu.demo.safari.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    List<Reservation> findAllByUserID(UUID userID);
    List<Reservation> findAllByBusID(UUID busID);
    List<Reservation> findAllByUserIDAndBusID(UUID userID,UUID busID);
}
