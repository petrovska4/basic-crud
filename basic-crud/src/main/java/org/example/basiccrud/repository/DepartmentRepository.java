package org.example.basiccrud.repository;
import org.example.basiccrud.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, UUID> {
    Optional<Department> findDepartmentByUuid(UUID uuid);
}
