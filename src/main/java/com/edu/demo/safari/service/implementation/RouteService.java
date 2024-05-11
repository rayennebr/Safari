package com.edu.demo.safari.service.implementation;

import com.edu.demo.safari.entities.Route;
import com.edu.demo.safari.mapper.mapStructService.RouteMapService;
import com.edu.demo.safari.repositories.RouteRepository;
import com.edu.demo.safari.service.IRouteService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Component
public class RouteService implements IRouteService {
    private final RouteRepository routeRepository;
    private final RouteMapService routeMapService;

    public RouteService(RouteRepository routeRepository, RouteMapService routeMapService) {
        this.routeRepository = routeRepository;
        this.routeMapService = routeMapService;
    }

    @Override
    public Route addRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public Route updateRoute(UUID routeId, Route route) {
        var updatedRoute=routeRepository.findById(routeId)
                .orElseThrow(()->new NoSuchElementException("route n'existe pas"));
        routeMapService.mapRoute(route,updatedRoute);
        return routeRepository.saveAndFlush(updatedRoute);
    }

    @Override
    public Route deleteRoute(UUID routeId) {
        var deletedRoute=routeRepository.findById(routeId)
                .orElseThrow(()->new NoSuchElementException("route n'existe pas"));
        routeRepository.delete(deletedRoute);
        return deletedRoute;
    }

    @Override
    public List<Route> getAllRoute() {
        return routeRepository.findAll();
    }
}
