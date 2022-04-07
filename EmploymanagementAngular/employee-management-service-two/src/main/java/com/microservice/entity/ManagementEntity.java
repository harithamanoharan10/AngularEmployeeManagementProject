package com.microservice.entity;

public class ManagementEntity {
	
	private int empId;
	private String fullName;
	private String address;
	private String mobile;
	private String manager;
	private String project;
	public ManagementEntity(int empId, String fullName, String address, String mobile, String manager, String project) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.address = address;
		this.mobile = mobile;
		this.manager = manager;
		this.project = project;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
}
