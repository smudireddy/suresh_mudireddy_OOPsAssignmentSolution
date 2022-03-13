package com.iitr.gl.oop.fop.gcas1.model;

public class TechDepartment extends Department {

	public TechDepartment() {
		super();
	}

	@Override
	public String departmentName() {
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadlineWork() {
		return "Complete by EOD";
	}

	public String getTechStackinformation() {
		return "core java";
	}
}
