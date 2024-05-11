package com.edu.demo.safari.service;

import com.edu.demo.safari.entities.Route;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IRouteService {

    Route addRoute(Route route);
    Route updateRoute(UUID routeId,Route route);
    Route deleteRoute(UUID routeId);
    List<Route> getAllRoute();
}
