package com.priyanka.incidentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.incidentmanagement.model.IncidentManagement;
@Repository
public interface IncidentManagementRepository extends JpaRepository<IncidentManagement,Integer> {


}
