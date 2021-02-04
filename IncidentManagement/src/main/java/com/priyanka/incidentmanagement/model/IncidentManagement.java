package com.priyanka.incidentmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="incidentmanagementdata")
@Entity
public class IncidentManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userEmail;
	private String applicationSection;
	private String issueDescription;
	private String issueTimeStamp;
	
	public IncidentManagement() {
		
	}
	public IncidentManagement(int id, String userEmail, String applicationSection, String issueDescription, String issueTimeStamp) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.applicationSection = applicationSection;
		this.issueDescription = issueDescription;
		this.issueTimeStamp = issueTimeStamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getApplicationSection() {
		return applicationSection;
	}
	public void setApplicationSection(String applicationSection) {
		this.applicationSection = applicationSection;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public String getIssueTimeStamp() {
		return issueTimeStamp;
	}
	public void setIssueTimeStamp(String issueTimeStamp) {
		this.issueTimeStamp = issueTimeStamp;
	}
	
	

}
