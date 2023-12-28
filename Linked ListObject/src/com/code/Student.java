package com.code;

public class Student {
	private String studentName;
	private String email;
	private int age;
	
	public Student(String studentName, String email, int age) {
		super();
		this.studentName = studentName;
		this.email = email;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", email=" + email + ", age=" + age + "]";
	}
	
	
	

}
