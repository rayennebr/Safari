package com.edu.demo.safari.repositories;

import com.edu.demo.safari.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BusRepository extends JpaRepository<Bus, UUID> {

    List<Bus> findAllByRouteID(UUID routeId);
}
