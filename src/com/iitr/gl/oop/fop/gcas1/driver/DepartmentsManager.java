package com.iitr.gl.oop.fop.gcas1.driver;

import com.iitr.gl.oop.fop.gcas1.model.AdminDepartment;
import com.iitr.gl.oop.fop.gcas1.model.HRDepartment;
import com.iitr.gl.oop.fop.gcas1.model.TechDepartment;

public class DepartmentsManager {
	
	public static void main(String[] args) {
		
		
		AdminDepartment adminDept = new AdminDepartment();
		
		
		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadlineWork());
		System.out.println(adminDept.isTodayAHoliday());
		
		
		HRDepartment hrDept = new HRDepartment();
		
		
		System.out.println("\nWelcome to " +hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadlineWork());
		System.out.println(hrDept.isTodayAHoliday());
		
		
		TechDepartment techDept = new TechDepartment();
		
		System.out.println("\nWelcome to " +techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadlineWork());
		System.out.println(techDept.getTechStackinformation());
		System.out.println(hrDept.isTodayAHoliday());
		
	}
}
