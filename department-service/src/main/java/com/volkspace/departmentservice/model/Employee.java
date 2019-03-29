package com.volkspace.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private int age;
    private String position;
}
