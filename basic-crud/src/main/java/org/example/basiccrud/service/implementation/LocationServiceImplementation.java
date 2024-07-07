package org.example.basiccrud.service.implementation;
import org.example.basiccrud.entity.Location;
import org.example.basiccrud.entity.Mapper.LocationMapper;
import org.example.basiccrud.entity.dto.LocationDto;
import org.example.basiccrud.repository.LocationRepository;
import org.example.basiccrud.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;

import java.util.List;
import java.util.UUID;

@Service
public class LocationServiceImplementation implements LocationService {
    LocationRepository locationRepository;

    @Autowired
    public LocationServiceImplementation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public LocationDto getLocationById(UUID id) {
        Location location = locationRepository.findLocationByUuid(id).orElseThrow(() -> new ResolutionException("No location found"));

        return LocationMapper.INSTANCE.toLocationDto(location);
    }

    @Override
    public List<LocationDto> getAllLocations() {
        return locationRepository.findAll().stream().map(LocationMapper.INSTANCE::toLocationDto).toList();
    }

    @Override
    public LocationDto createLocation(LocationDto locationDto) {
        locationRepository.save(LocationMapper.INSTANCE.toLocation(locationDto));

        return locationDto;
    }

    public LocationDto updateLocation(UUID id, LocationDto locationDto) {
        Location location = locationRepository.findLocationByUuid(id).orElseThrow(() -> new ResolutionException("No location found"));

        location.setName(locationDto.getName());
        locationRepository.save(location);

        return locationDto;
    }

    public void deleteLocation(UUID id) {
        locationRepository.deleteById(id);
    }
}
