package com.edu.demo.safari.repositories;

import com.edu.demo.safari.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, UUID> {

    List<Feedback>findAllByUserID(UUID userID);
    List<Feedback>findAllByBusID(UUID busID);
    List<Feedback>findAllByUserIDAndBusID(UUID userID,UUID busID);
}
