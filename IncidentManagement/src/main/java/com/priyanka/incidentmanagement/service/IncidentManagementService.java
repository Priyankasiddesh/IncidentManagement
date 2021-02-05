package com.priyanka.incidentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanka.incidentmanagement.model.IncidentManagement;
import com.priyanka.incidentmanagement.repository.IncidentManagementRepository;

@Service
public class IncidentManagementService {
	@Autowired
	IncidentManagementRepository imrepo;

	public void create(IncidentManagement im) {
		imrepo.save(im);
		
	}
	
	public List<IncidentManagement> getAll(){
		return imrepo.findAll();
	}
	
	public Optional<IncidentManagement> getElementById(int id) {
		return imrepo.findById(id);
	}
	
	public IncidentManagement getByApplication(String applicationsection) {
		return imrepo.getByApplication(applicationsection);
	}

}
