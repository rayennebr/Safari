package com.edu.demo.safari.dto;

import com.edu.demo.safari.types.MultiLanguage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link com.edu.demo.safari.entities.Reservation} entity
 */
@Builder
public class ReservationDto implements Serializable {
    private UUID reservationID;
    private UUID userID;
    private UUID busID;
    private String status;
    private String source;
    private String destination;
    private Date date;
    private Date createdDate;
    private Date modifiedDate;

    public ReservationDto() {
    }

    public ReservationDto(UUID reservationID, UUID userID, UUID busID, String status, String source, String destination, Date date, Date createdDate, Date modifiedDate) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.busID = busID;
        this.status = status;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getReservationID() {
        return reservationID;
    }

    public void setReservationID(UUID reservationID) {
        this.reservationID = reservationID;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationDto that = (ReservationDto) o;
        return Objects.equals(reservationID, that.reservationID) && Objects.equals(userID, that.userID) && Objects.equals(busID, that.busID) && Objects.equals(status, that.status) && Objects.equals(source, that.source) && Objects.equals(destination, that.destination) && Objects.equals(date, that.date) && Objects.equals(createdDate, that.createdDate) && Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID, userID, busID, status, source, destination, date, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "reservationID=" + reservationID +
                ", userID=" + userID +
                ", busID=" + busID +
                ", status='" + status + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}