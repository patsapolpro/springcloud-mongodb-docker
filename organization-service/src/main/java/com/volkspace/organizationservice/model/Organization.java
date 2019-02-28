package com.volkspace.organizationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Organization {
    private Long id;
    private final String name;
    private final String address;
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
}
