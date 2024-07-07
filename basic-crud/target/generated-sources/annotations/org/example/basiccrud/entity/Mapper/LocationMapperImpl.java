package org.example.basiccrud.entity.Mapper;

import javax.annotation.processing.Generated;
import org.example.basiccrud.entity.Location;
import org.example.basiccrud.entity.dto.LocationDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-07T17:11:26+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class LocationMapperImpl implements LocationMapper {

    @Override
    public Location toLocation(LocationDto locationDto) {
        if ( locationDto == null ) {
            return null;
        }

        Location location = new Location();

        location.setUuid( locationDto.getUuid() );
        location.setName( locationDto.getName() );

        return location;
    }

    @Override
    public LocationDto toLocationDto(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationDto locationDto = new LocationDto();

        locationDto.setUuid( location.getUuid() );
        locationDto.setName( location.getName() );

        return locationDto;
    }
}
