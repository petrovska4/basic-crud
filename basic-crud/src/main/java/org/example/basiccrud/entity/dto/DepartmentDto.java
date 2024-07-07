package org.example.basiccrud.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private UUID uuid;
    private String Name;
    private UUID locationId;
}
