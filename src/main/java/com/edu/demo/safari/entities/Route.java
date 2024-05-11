package com.edu.demo.safari.entities;

import com.edu.demo.safari.types.MultiLanguage;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "_route")
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID routeID;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage routeFrom;
    @JdbcTypeCode(SqlTypes.JSON)
    private MultiLanguage routeTo;
    private int distance;

    public Route() {
    }

    public Route(UUID routeID, MultiLanguage routeFrom, MultiLanguage routeTo, int distance) {
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

    public MultiLanguage getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(MultiLanguage routeFrom) {
        this.routeFrom = routeFrom;
    }

    public MultiLanguage getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(MultiLanguage routeTo) {
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
        Route route = (Route) o;
        return distance == route.distance && Objects.equals(routeID, route.routeID) && Objects.equals(routeFrom, route.routeFrom) && Objects.equals(routeTo, route.routeTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeID, routeFrom, routeTo, distance);
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeID=" + routeID +
                ", routeFrom=" + routeFrom +
                ", routeTo=" + routeTo +
                ", distance=" + distance +
                '}';
    }
}
