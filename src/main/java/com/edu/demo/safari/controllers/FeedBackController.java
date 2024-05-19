package com.edu.demo.safari.controllers;

import com.edu.demo.safari.dto.FeedbackDto;
import com.edu.demo.safari.entities.Feedback;
import com.edu.demo.safari.service.IFeedBackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin("*")
public class FeedBackController {

    private final IFeedBackService feedBackService;

    public FeedBackController(IFeedBackService feedBackService) {
        this.feedBackService = feedBackService;
    }

    @PostMapping("/")
    Feedback addFeedBack(@RequestBody Feedback feedback)
    {
        return feedBackService.addFeedBack(feedback);
    }
    @GetMapping("/")
    List<Feedback> getAllFeedBack()
    {
        return feedBackService.getAllFeedBack();
    }

    @GetMapping("/{userID}/{ln}")
    List<FeedbackDto> findAllByUserId(@PathVariable UUID userID,@PathVariable String ln)
    {
        return feedBackService.findAllByUserId(userID,ln);
    }
    @GetMapping("/{busID}/{ln}")
    List<FeedbackDto>findAllByBusId(@PathVariable UUID busID,@PathVariable String ln)
    {
        return feedBackService.findAllByBusId(busID, ln);
    }
    @GetMapping("/{userID}/{busID}/{ln}")
    List<FeedbackDto>findAllByUserIdAndBusId(@PathVariable UUID userID,@PathVariable UUID busID,@PathVariable String ln)
    {
        return feedBackService.findAllByUserIdAndBusId(userID, busID, ln);
    }
}
