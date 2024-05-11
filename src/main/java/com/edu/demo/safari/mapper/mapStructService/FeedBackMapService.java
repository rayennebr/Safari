package com.edu.demo.safari.mapper.mapStructService;

import com.edu.demo.safari.dto.FeedbackDto;
import com.edu.demo.safari.entities.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface FeedBackMapService {
    void mapFeedBack(Feedback feedbackSource, @MappingTarget Feedback feedback);
}
