package org.example.basiccrud.service;
import org.example.basiccrud.entity.dto.LocationDto;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface LocationService {
    public abstract LocationDto getLocationById(UUID id);
    public abstract List<LocationDto> getAllLocations();
    public abstract LocationDto createLocation(LocationDto locationDto);
    public abstract LocationDto updateLocation(UUID id, LocationDto locationDto);
    public abstract void deleteLocation(UUID id);

}
