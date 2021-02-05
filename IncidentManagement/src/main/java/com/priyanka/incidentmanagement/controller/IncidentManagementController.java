package com.priyanka.incidentmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.incidentmanagement.model.IncidentManagement;
import com.priyanka.incidentmanagement.service.IncidentManagementService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//@RequestMapping("/incidence")

@RestController
public class IncidentManagementController {
	@Autowired
	private IncidentManagementService ims;
	
	
	@PostMapping(path="/incidencepost",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<IncidentManagement> create(@RequestBody final IncidentManagement im){
		ims.create(im);
		
		return ims.getAll();
	}
	@GetMapping("/incidence")
	public List<IncidentManagement> getAll(){
		System.out.println("id");

		return ims.getAll();
	}
	
	//@RequestMapping(value = "/incidence/{id}",method=RequestMethod.GET,produces="application/json")
	@GetMapping("/incidence/{id}")
	public Optional<IncidentManagement> getElementById(@PathVariable(value="id")int id) {
		System.out.println(id);
		return ims.getElementById(id);
	}
	@RequestMapping(value="/incidence/idm/{application_section}",method=RequestMethod.GET,produces="application/json")
	public IncidentManagement getApplicationSection(@PathVariable(value="application_section") String application_section) {
		System.out.println(application_section);
		return ims.getByApplication(application_section);
	}

}
