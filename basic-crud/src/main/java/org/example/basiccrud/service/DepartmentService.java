package org.example.basiccrud.service;
import org.example.basiccrud.entity.dto.DepartmentDto;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface DepartmentService {
    public abstract DepartmentDto getDepartmentById(UUID id);
    public abstract List<DepartmentDto> getAllDepartments();
    public abstract DepartmentDto createDepartment(DepartmentDto departmentDto);
    public abstract DepartmentDto updateDepartment(UUID id, DepartmentDto departmentDto);
    public abstract void deleteDepartment(UUID id);
}
