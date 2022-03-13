package com.iitr.gl.oop.fop.gcas1.model;

public class HRDepartment extends Department {

	public HRDepartment() {
		super();
	}

	@Override
	public String departmentName() {
		return "Hr Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendence";
	}

	@Override
	public String getWorkDeadlineWork() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
