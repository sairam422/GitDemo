package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Sai Ram Gubbala");
	}
	
	public void studentDept() {
		System.out.println("Electronic and Communication Eng Dept");
	}
	
	public void studentId() {
		System.out.println("13MEM127");
	}
	
	
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}

}
