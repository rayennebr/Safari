package com.edu.demo.safari.mapper.mapStructService;

import com.edu.demo.safari.dto.BusDto;
import com.edu.demo.safari.entities.Bus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BusMapService {
    void mapToBus(Bus bus, @MappingTarget Bus updatedBus);
}
