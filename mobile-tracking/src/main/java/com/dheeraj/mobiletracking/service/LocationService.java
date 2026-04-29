package com.dheeraj.mobiletracking.service;
import com.dheeraj.mobiletracking.model.Location;
import com.dheeraj.mobiletracking.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationService {
    private final LocationRepository repository;

    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}

