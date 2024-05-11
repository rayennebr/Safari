package com.edu.demo.safari.mapper;

import com.edu.demo.safari.dto.RouteDto;
import com.edu.demo.safari.entities.Route;
import org.springframework.stereotype.Component;

@Component
public class RouteMapper {

    public RouteDto mapToRouteDto(Route route,String ln)
    {
        return RouteDto.builder()
                .routeID(route.getRouteID())
                .routeTo(route.getRouteTo().getContent().get(ln))
                .routeFrom(route.getRouteFrom().getContent().get(ln))
                .distance(route.getDistance())
                .build();
    }
}
