package com.edu.demo.safari.entities;

import com.edu.demo.safari.types.MultiLanguage;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "_feedback")
public class Feedback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID feedbackID;
    private UUID userID;
    private UUID busID;
    private int driverRating;
    private int serviceRating;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage comments;
    @ManyToOne
    @JoinColumn(name = "userID",referencedColumnName = "userID",insertable = false,updatable = false)
    private User user;
    @OneToOne
    @JoinColumn(name = "busID",referencedColumnName = "busID",insertable = false,updatable = false)
    private Bus bus;

    public Feedback() {
    }

    public Feedback(UUID feedbackID, UUID userID, UUID busID, int driverRating, int serviceRating, MultiLanguage comments, User user, Bus bus) {
        this.feedbackID = feedbackID;
        this.userID = userID;
        this.busID = busID;
        this.driverRating = driverRating;
        this.serviceRating = serviceRating;
        this.comments = comments;
        this.user = user;
        this.bus = bus;
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

    public MultiLanguage getComments() {
        return comments;
    }

    public void setComments(MultiLanguage comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return driverRating == feedback.driverRating && serviceRating == feedback.serviceRating && Objects.equals(feedbackID, feedback.feedbackID) && Objects.equals(userID, feedback.userID) && Objects.equals(busID, feedback.busID) && Objects.equals(comments, feedback.comments) && Objects.equals(user, feedback.user) && Objects.equals(bus, feedback.bus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackID, userID, busID, driverRating, serviceRating, comments, user, bus);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackID=" + feedbackID +
                ", userID=" + userID +
                ", busID=" + busID +
                ", driverRating=" + driverRating +
                ", serviceRating=" + serviceRating +
                ", comments=" + comments +
                ", user=" + user +
                ", bus=" + bus +
                '}';
    }
}
