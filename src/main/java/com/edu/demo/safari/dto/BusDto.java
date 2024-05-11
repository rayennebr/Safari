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
 * A DTO for the {@link com.edu.demo.safari.entities.Bus} entity
 */

@Builder
public class BusDto implements Serializable {
    private UUID busID;
    private String busName;
    private String driverName;
    private String busType;
    private String routeForm;
    private int seat;
    private int availableSeat;
    private Date departureDate;
    private Date arrivalDate;
    private Date createdDate;
    private Date modifiedDate;

    public BusDto() {
    }

    public BusDto(UUID busID, String busName, String driverName, String busType, String routeForm, int seat, int availableSeat, Date departureDate, Date arrivalDate, Date createdDate, Date modifiedDate) {
        this.busID = busID;
        this.busName = busName;
        this.driverName = driverName;
        this.busType = busType;
        this.routeForm = routeForm;
        this.seat = seat;
        this.availableSeat = availableSeat;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public UUID getBusID() {
        return busID;
    }

    public void setBusID(UUID busID) {
        this.busID = busID;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getRouteForm() {
        return routeForm;
    }

    public void setRouteForm(String routeForm) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusDto busDto = (BusDto) o;
        return seat == busDto.seat && availableSeat == busDto.availableSeat && Objects.equals(busID, busDto.busID) && Objects.equals(busName, busDto.busName) && Objects.equals(driverName, busDto.driverName) && Objects.equals(busType, busDto.busType) && Objects.equals(routeForm, busDto.routeForm) && Objects.equals(departureDate, busDto.departureDate) && Objects.equals(arrivalDate, busDto.arrivalDate) && Objects.equals(createdDate, busDto.createdDate) && Objects.equals(modifiedDate, busDto.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busID, busName, driverName, busType, routeForm, seat, availableSeat, departureDate, arrivalDate, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "BusDto{" +
                "busID=" + busID +
                ", busName='" + busName + '\'' +
                ", driverName='" + driverName + '\'' +
                ", busType='" + busType + '\'' +
                ", routeForm='" + routeForm + '\'' +
                ", seat=" + seat +
                ", availableSeat=" + availableSeat +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}