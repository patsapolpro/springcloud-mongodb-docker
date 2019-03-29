package com.volkspace.departmentservice.repository;

import com.volkspace.departmentservice.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

    List<Department> findByOrganizationId(Long organizationId);

}
