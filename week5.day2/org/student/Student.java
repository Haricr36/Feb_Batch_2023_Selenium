package org.student;

import org.deparment.Deparment;

public class Student extends Deparment {
	
	public void studentName() {
		String name = "Hari";
		System.out.println("Name Of student :"+ name);
	}
	public void studentDept() {
		 String Dep = "CSE";
		 System.out.println("Deparment name : " + Dep );
	}
	public void studentId() {
		int studId = 34231;
		System.out.println("Student Id no : "+ studId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student info = new Student();
		info.collegeName();
		info.collegecode();
		info.collegeRank();
		info.DeparmentName();
		info.studentName();
		info.studentDept();
		info.studentId();
		
	}

}
