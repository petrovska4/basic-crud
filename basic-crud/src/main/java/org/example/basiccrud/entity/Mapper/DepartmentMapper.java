package org.example.basiccrud.entity.Mapper;

import org.example.basiccrud.entity.Department;
import org.example.basiccrud.entity.dto.DepartmentDto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    Department mapToDepartment(DepartmentDto departmentDto);
    DepartmentDto mapToDepartmentDto(Department department);

}
