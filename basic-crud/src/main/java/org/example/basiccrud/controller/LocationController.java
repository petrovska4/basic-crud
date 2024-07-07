package org.example.basiccrud.controller;

import org.example.basiccrud.entity.dto.LocationDto;
import org.example.basiccrud.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/location")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/{id}")
    public LocationDto getLocation(@PathVariable UUID id) {
        return locationService.getLocationById(id);
    }

    @GetMapping
    public List<LocationDto> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping
    public LocationDto createLocation(@RequestBody LocationDto locationDto) {
        return locationService.createLocation(locationDto);
    }

    @PutMapping("/{id}")
    public LocationDto updateLocation(@PathVariable UUID id, @RequestBody LocationDto locationDto) {
        return locationService.updateLocation(id, locationDto);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable UUID id) {
        locationService.deleteLocation(id);
    }
}
