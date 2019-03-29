package com.volkspace.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "department")
public class Department {
    @Id
    private Long id;
    private final Long organizationId;
    private final String name;
    private List<Employee> employees = new ArrayList<>();
}
