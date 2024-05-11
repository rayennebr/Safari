package com.edu.demo.safari.service;

import com.edu.demo.safari.dto.FeedbackDto;
import com.edu.demo.safari.entities.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IFeedBackService {
    Feedback addFeedBack(Feedback feedback);
    Feedback updateFeedBack(UUID feedBackId,Feedback feedback);
    Feedback deleteFeedBack(UUID feedBackId);
    List<Feedback>getAllFeedBack();
    List<FeedbackDto> findAllByUserId(UUID userID,String ln);
    List<FeedbackDto>findAllByBusId(UUID busID,String ln);
    List<FeedbackDto>findAllByUserIdAndBusId(UUID userID,UUID busID,String ln);
}
