package com.edu.demo.safari.mapper;

import com.edu.demo.safari.dto.FeedbackDto;
import com.edu.demo.safari.entities.Feedback;
import org.springframework.stereotype.Component;

@Component
public class FeedbackMapper {

    public FeedbackDto mapToFeedBackDto(Feedback feedback,String ln)
    {
        return FeedbackDto.builder()
                .feedbackID(feedback.getFeedbackID())
                .busID(feedback.getBusID())
                .userID(feedback.getUserID())
                .comments(feedback.getComments().getContent().get(ln))
                .driverRating(feedback.getDriverRating())
                .serviceRating(feedback.getServiceRating())
                .build();
    }
}
