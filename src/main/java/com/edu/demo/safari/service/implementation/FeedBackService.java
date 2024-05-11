package com.edu.demo.safari.service.implementation;

import com.edu.demo.safari.dto.FeedbackDto;
import com.edu.demo.safari.entities.Feedback;
import com.edu.demo.safari.mapper.FeedbackMapper;
import com.edu.demo.safari.mapper.mapStructService.FeedBackMapService;
import com.edu.demo.safari.repositories.FeedbackRepository;
import com.edu.demo.safari.service.IFeedBackService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class FeedBackService implements IFeedBackService {

    private final FeedbackRepository repository;
    private final FeedbackMapper mapper;
    private final FeedBackMapService feedBackMapService;

    public FeedBackService(FeedbackRepository repository, FeedbackMapper mapper, FeedBackMapService feedBackMapService) {
        this.repository = repository;
        this.mapper = mapper;
        this.feedBackMapService = feedBackMapService;
    }

    @Override
    public Feedback addFeedBack(Feedback feedback) {
        return repository.save(feedback);
    }

    @Override
    public Feedback updateFeedBack(UUID feedBackId, Feedback feedback) {
        var updatedFeedback=repository.findById(feedBackId)
                .orElseThrow(()->new NoSuchElementException("feedback n'existe pas"));
        feedBackMapService.mapFeedBack(feedback,updatedFeedback);
        return repository.saveAndFlush(updatedFeedback);
    }

    @Override
    public Feedback deleteFeedBack(UUID feedBackId) {
        var deletedFeedback=repository.findById(feedBackId)
                .orElseThrow(()->new NoSuchElementException("feedback n'existe pas"));
        repository.delete(deletedFeedback);
        return deletedFeedback;
    }

    @Override
    public List<Feedback> getAllFeedBack() {
        return repository.findAll();
    }

    @Override
    public List<FeedbackDto> findAllByUserId(UUID userID,String ln) {
        return repository.findAllByUserID(userID)
                .stream()
                .map(feedback -> this.mapper.mapToFeedBackDto(feedback,ln))
                .toList();
    }

    @Override
    public List<FeedbackDto> findAllByBusId(UUID busID,String ln) {
        return repository.findAllByBusID(busID)
                .stream()
                .map(feedback -> this.mapper.mapToFeedBackDto(feedback,ln))
                .toList();
    }

    @Override
    public List<FeedbackDto> findAllByUserIdAndBusId(UUID userID, UUID busID,String ln) {
        return repository.findAllByUserIDAndBusID(userID,busID)
                .stream()
                .map(feedback -> this.mapper.mapToFeedBackDto(feedback,ln))
                .toList();
    }
}
