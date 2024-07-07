package org.example.basiccrud.entity.Mapper;

import org.example.basiccrud.entity.Location;
import org.example.basiccrud.entity.dto.LocationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LocationMapper {

    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    Location toLocation(LocationDto locationDto);
    LocationDto toLocationDto(Location location);
}
