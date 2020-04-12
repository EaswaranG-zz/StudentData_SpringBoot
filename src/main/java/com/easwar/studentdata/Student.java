package com.easwar.studentdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_department")
	private String studentDepartment;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int student_id) {
		this.studentId = student_id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String student_name) {
		this.studentName = student_name;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String student_department) {
		this.studentDepartment = student_department;
	}

	
}
