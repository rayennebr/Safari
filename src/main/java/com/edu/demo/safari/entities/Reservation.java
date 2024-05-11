package com.edu.demo.safari.entities;

import com.edu.demo.safari.types.MultiLanguage;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "_reservation")
@EntityListeners(AuditingEntityListener.class)
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID reservationID;
    private UUID userID;
    private UUID busID;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage status;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage source;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage destination;
    private Date date;


    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "busID",referencedColumnName = "busID", insertable = false, updatable = false)
    Bus bus;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date modifiedDate;

    public Reservation() {
    }

    public Reservation(UUID reservationID, UUID userID, UUID busID, MultiLanguage status, MultiLanguage source, MultiLanguage destination, Date date, User user, Bus bus, Date createdDate, Date modifiedDate) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.busID = busID;
        this.status = status;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.user = user;
        this.bus = bus;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getReservationID() {
        return reservationID;
    }

    public UUID getBusID() {
        return busID;
    }

    public void setBusID(UUID busID) {
        this.busID = busID;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setReservationID(UUID reservationID) {
        this.reservationID = reservationID;
    }

    public MultiLanguage getStatus() {
        return status;
    }

    public void setStatus(MultiLanguage status) {
        this.status = status;
    }

    public MultiLanguage getSource() {
        return source;
    }

    public void setSource(MultiLanguage source) {
        this.source = source;
    }

    public MultiLanguage getDestination() {
        return destination;
    }

    public void setDestination(MultiLanguage destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(reservationID, that.reservationID) && Objects.equals(status, that.status) && Objects.equals(source, that.source) && Objects.equals(destination, that.destination) && Objects.equals(date, that.date) && Objects.equals(user, that.user) && Objects.equals(createdDate, that.createdDate) && Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID, status, source, destination, date, user, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", status=" + status +
                ", source=" + source +
                ", destination=" + destination +
                ", date=" + date +
                ", user=" + user +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
