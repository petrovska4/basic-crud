package org.example.basiccrud.entity.Mapper;

import javax.annotation.processing.Generated;
import org.example.basiccrud.entity.Department;
import org.example.basiccrud.entity.dto.DepartmentDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-07T21:21:16+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public Department mapToDepartment(DepartmentDto departmentDto) {
        if ( departmentDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setUuid( departmentDto.getUuid() );
        department.setName( departmentDto.getName() );

        return department;
    }

    @Override
    public DepartmentDto mapToDepartmentDto(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setUuid( department.getUuid() );
        departmentDto.setName( department.getName() );

        return departmentDto;
    }
}
