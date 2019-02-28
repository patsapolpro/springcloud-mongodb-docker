package com.volkspace.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Department {
    private Long id;
    private final Long organizationId;
    private final String name;
    private List<Employee> employees = new ArrayList<>();
}
