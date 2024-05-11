package com.edu.demo.safari.dto;

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
 * A DTO for the {@link com.edu.demo.safari.entities.Route} entity
 */
@Builder
public class RouteDto implements Serializable {
    private UUID routeID;
    private String routeFrom;
    private String routeTo;
    private int distance;

    public RouteDto() {
    }

    public RouteDto(UUID routeID, String routeFrom, String routeTo, int distance) {
        this.routeID = routeID;
        this.routeFrom = routeFrom;
        this.routeTo = routeTo;
        this.distance = distance;
    }

    public UUID getRouteID() {
        return routeID;
    }

    public void setRouteID(UUID routeID) {
        this.routeID = routeID;
    }

    public String getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(String routeFrom) {
        this.routeFrom = routeFrom;
    }

    public String getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteDto routeDto = (RouteDto) o;
        return distance == routeDto.distance && Objects.equals(routeID, routeDto.routeID) && Objects.equals(routeFrom, routeDto.routeFrom) && Objects.equals(routeTo, routeDto.routeTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeID, routeFrom, routeTo, distance);
    }

    @Override
    public String toString() {
        return "RouteDto{" +
                "routeID=" + routeID +
                ", routeFrom='" + routeFrom + '\'' +
                ", routeTo='" + routeTo + '\'' +
                ", distance=" + distance +
                '}';
    }
}