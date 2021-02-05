package com.priyanka.incidentmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.priyanka.incidentmanagement.model.IncidentManagement;
@Repository
public interface IncidentManagementRepository extends JpaRepository<IncidentManagement,Integer> {
	@Query(value="select * from incidentmanagementdata  where application_section=?1",nativeQuery = true)
	public IncidentManagement getByApplication(String applicationsection);
		
	


}
