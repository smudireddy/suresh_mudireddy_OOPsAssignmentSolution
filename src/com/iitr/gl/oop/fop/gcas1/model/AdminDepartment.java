package com.iitr.gl.oop.fop.gcas1.model;

public class AdminDepartment extends Department {

	public AdminDepartment() {
		super();
	}

	@Override
	public String departmentName() {
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadlineWork() {
		return "Complete by EOD";
	}
}
