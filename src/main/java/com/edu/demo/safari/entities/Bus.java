package com.edu.demo.safari.entities;

import com.edu.demo.safari.types.MultiLanguage;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "_bus")
@EntityListeners(AuditingEntityListener.class)
public class Bus implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID busID;

    private UUID routeID;
    private MultiLanguage busName;
    private MultiLanguage driverName;
    private MultiLanguage busType;
    private MultiLanguage routeForm;
    private int seat;
    private int availableSeat;
    private Date departureDate;
    private Date arrivalDate;

    @ManyToOne
    @JoinColumn(name = "routeID",referencedColumnName = "routeID",insertable = false,updatable = false)
    private Route route;

    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date modifiedDate;

    public Bus() {
    }

    public Bus(UUID busID, UUID routeID, MultiLanguage busName, MultiLanguage driverName, MultiLanguage busType, MultiLanguage routeForm, int seat, int availableSeat, Date departureDate, Date arrivalDate, Route route, Date createdDate, Date modifiedDate) {
        this.busID = busID;
        this.routeID = routeID;
        this.busName = busName;
        this.driverName = driverName;
        this.busType = busType;
        this.routeForm = routeForm;
        this.seat = seat;
        this.availableSeat = availableSeat;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.route = route;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getBusID() {
        return busID;
    }

    public void setBusID(UUID busID) {
        this.busID = busID;
    }

    public MultiLanguage getBusName() {
        return busName;
    }

    public void setBusName(MultiLanguage busName) {
        this.busName = busName;
    }

    public MultiLanguage getDriverName() {
        return driverName;
    }

    public void setDriverName(MultiLanguage driverName) {
        this.driverName = driverName;
    }

    public MultiLanguage getBusType() {
        return busType;
    }

    public void setBusType(MultiLanguage busType) {
        this.busType = busType;
    }

    public MultiLanguage getRouteForm() {
        return routeForm;
    }

    public void setRouteForm(MultiLanguage routeForm) {
        this.routeForm = routeForm;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    public UUID getRouteID() {
        return routeID;
    }

    public void setRouteID(UUID routeID) {
        this.routeID = routeID;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return seat == bus.seat && availableSeat == bus.availableSeat && Objects.equals(busID, bus.busID) && Objects.equals(routeID, bus.routeID) && Objects.equals(busName, bus.busName) && Objects.equals(driverName, bus.driverName) && Objects.equals(busType, bus.busType) && Objects.equals(routeForm, bus.routeForm) && Objects.equals(departureDate, bus.departureDate) && Objects.equals(arrivalDate, bus.arrivalDate) && Objects.equals(route, bus.route) && Objects.equals(createdDate, bus.createdDate) && Objects.equals(modifiedDate, bus.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busID, routeID, busName, driverName, busType, routeForm, seat, availableSeat, departureDate, arrivalDate, route, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busID=" + busID +
                ", routeID=" + routeID +
                ", busName=" + busName +
                ", driverName=" + driverName +
                ", busType=" + busType +
                ", routeForm=" + routeForm +
                ", seat=" + seat +
                ", availableSeat=" + availableSeat +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", route=" + route +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
