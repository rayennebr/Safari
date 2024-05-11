package com.edu.demo.safari.mapper.mapStructService;

import com.edu.demo.safari.dto.RouteDto;
import com.edu.demo.safari.entities.Route;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RouteMapService {
    void mapRoute(Route routeSource, @MappingTarget Route route);
}
