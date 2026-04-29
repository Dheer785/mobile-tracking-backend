package com.dheeraj.mobiletracking.controller;
import com.dheeraj.mobiletracking.model.Location;
import com.dheeraj.mobiletracking.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService service;

    public LocationController(LocationService service) {
        this.service = service;
    }

    @PostMapping
    public Location saveLocation(@RequestBody Location location) {
        return service.saveLocation(location);
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return service.getAllLocations();
    }
}



