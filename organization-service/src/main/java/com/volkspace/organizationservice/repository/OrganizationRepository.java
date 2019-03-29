package com.volkspace.organizationservice.repository;

import com.volkspace.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
}
