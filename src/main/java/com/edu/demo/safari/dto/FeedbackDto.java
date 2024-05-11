package com.edu.demo.safari.dto;

import com.edu.demo.safari.entities.Feedback;
import com.edu.demo.safari.types.MultiLanguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link Feedback} entity
 */
@Builder
public class FeedbackDto implements Serializable {
    private UUID feedbackID;
    private UUID userID;
    private UUID busID;
    private int driverRating;
    private int serviceRating;
    private String comments;

    public FeedbackDto() {
    }

    public FeedbackDto(UUID feedbackID, UUID userID, UUID busID, int driverRating, int serviceRating, String comments) {
        this.feedbackID = feedbackID;
        this.userID = userID;
        this.busID = busID;
        this.driverRating = driverRating;
        this.serviceRating = serviceRating;
        this.comments = comments;
    }

    public UUID getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(UUID feedbackID) {
        this.feedbackID = feedbackID;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public UUID getBusID() {
        return busID;
    }

    public void setBusID(UUID busID) {
        this.busID = busID;
    }

    public int getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }

    public int getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(int serviceRating) {
        this.serviceRating = serviceRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedbackDto that = (FeedbackDto) o;
        return driverRating == that.driverRating && serviceRating == that.serviceRating && Objects.equals(feedbackID, that.feedbackID) && Objects.equals(userID, that.userID) && Objects.equals(busID, that.busID) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackID, userID, busID, driverRating, serviceRating, comments);
    }

    @Override
    public String toString() {
        return "FeedbackDto{" +
                "feedbackID=" + feedbackID +
                ", userID=" + userID +
                ", busID=" + busID +
                ", driverRating=" + driverRating +
                ", serviceRating=" + serviceRating +
                ", comments='" + comments + '\'' +
                '}';
    }
}