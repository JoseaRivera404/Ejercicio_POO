package org.generation.classes;

public class Student {

	String firstName;
	String lastName;
	int registration;
	int grade;
	int year;
   
	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
	
	public Student(String firstName, String lastName, int registration) {
		this(firstName, lastName, registration, 60, 1);
	}
	
	public Student(String firstName, String lastName) {
		this(firstName, lastName, 0, 60, 1);	   
	}
	
	public void printFullName(){
		//TODO implement
		System.out.println("Full name: " + this.firstName + " " + this.lastName );
	}
	
	public boolean isApproved(){
		//TODO implement: should return true if grade >= 60
		if (this.grade >= 60) {
			return true;
		}else {
			return false;
		}
	}
	
	public void changeYearIfApproved(){
		//TODO implement: the student should advance to the next year if he/she grade is >= 60
		// Make year = year + 1, and print "Congragulations" if the student has been approved
		if (isApproved()) {
			this.year += 1;
			System.out.println("Congratulations " + this.firstName + " " + this.lastName);
		}   
	}
   
	public String toString() {
		return "\nFull name: " + this.firstName + " " + this.lastName + "\nRegistration: " + this.registration + "\nGrade: " + this.grade + "\nYear: " + this.year + "\n+---------------------------------";
	}
 }
