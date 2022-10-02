package org.tcs.test;

public class EveningPolymorph {

	public void studentDetail() {
		
		System.out.println("Attending Polymorphism class");
	}
	
	public void studentDetail(int age) {
		
		System.out.println("student age is"+age);
	}
	
	public void studentDetail(String name) {
		
		System.out.println("Student name is"+name);
	}
	
	public void studentDetail(int studentId, String courseName) {
		
		System.out.println("Student ID is" +studentId +courseName );
	}

	public void studentDetail(String trainerName, int pincode) {
		
		System.out.println("Attending Polymorphism class"+trainerName +pincode);
	}
	

	
	public static void main(String[] args) {
		
		EveningPolymorph e = new EveningPolymorph();
		e.studentDetail("Bala");
		e.studentDetail("Raj", 600003);
		e.studentDetail();
		e.studentDetail(10);
		
		e.studentDetail(2000, "Selenium");
		
		
		
	}
}
