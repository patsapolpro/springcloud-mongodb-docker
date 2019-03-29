package com.volkspace.organizationservice.model;

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
@Document(collection = "organization")
public class Organization {
    @Id
    private Long id;
    private final String name;
    private final String address;
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
}
