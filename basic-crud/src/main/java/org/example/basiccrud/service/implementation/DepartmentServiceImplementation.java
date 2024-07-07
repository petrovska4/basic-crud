package org.example.basiccrud.service.implementation;
import org.example.basiccrud.entity.Department;
import org.example.basiccrud.entity.Mapper.DepartmentMapper;
import org.example.basiccrud.entity.dto.DepartmentDto;
import org.example.basiccrud.repository.DepartmentRepository;
import org.example.basiccrud.repository.LocationRepository;
import org.example.basiccrud.service.DepartmentService;
import org.example.basiccrud.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DepartmentServiceImplementation implements DepartmentService {
    DepartmentRepository departmentRepository;
    LocationRepository locationRepository;

    @Autowired
    public DepartmentServiceImplementation(DepartmentRepository departmentRepository, LocationRepository locationRepository) {
        this.departmentRepository = departmentRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public DepartmentDto getDepartmentById(UUID id) {
        Department department = departmentRepository.findDepartmentByUuid(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found"));
        return DepartmentMapper.INSTANCE.mapToDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {
        return departmentRepository.findAll().stream().map(DepartmentMapper.INSTANCE::mapToDepartmentDto).toList();
    }

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        departmentRepository.save(DepartmentMapper.INSTANCE.mapToDepartment(departmentDto));
        return departmentDto;
    }

    @Override
    public DepartmentDto updateDepartment(UUID id, DepartmentDto departmentDto) {
        departmentRepository.save(DepartmentMapper.INSTANCE.mapToDepartment(departmentDto));
        return departmentDto;
    }

    @Override
    public void deleteDepartment(UUID id) {
        departmentRepository.deleteById(id);
    }

}
