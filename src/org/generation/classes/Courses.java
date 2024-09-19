package org.generation.classes;

import java.util.HashMap;
import java.util.List;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	HashMap<Integer, Student> enrolledCourses = new HashMap<Integer, Student>();
	public Courses(String courseName, String professorName,int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	
	public void enroll(Student student){
		//TODO add the student to the collection
		this.enrolledCourses.put(student.registration, student);
	}
	
	public void enroll(List<Student> students){
	      //TODO add all the students to the collection
		for (Student student : students) {
				enroll(student);
		}
	}

	public void unEnroll(Student student){
		//TODO remove this student from the collection
		// Hint: check if that really is this student
		if (this.enrolledCourses.containsKey(student.registration)) {
			this.enrolledCourses.remove(student.registration);
		}else {
			System.out.println("The student is not in the course");
		}
	}

	public int countStudents(){
		//TODO implement
		return this.enrolledCourses.size();
	}
   
	public int bestGrade(){
		//TODO implement
		int bestGrade = 0;
		for (Student student:this.enrolledCourses.values()) {
			if (bestGrade < student.grade) {
				bestGrade = student.grade;
			}
		}
		return bestGrade;
	}
	
	public float averageGrade() {
		int total = 0;
		for (Student student:this.enrolledCourses.values()) {
			total += student.grade;
		}
		total /= this.enrolledCourses.size();
		return total;
	}
	
	public void ranking() {
//		this.enrolledCourses.values();
	}
	
	public void aboveCourseAverage() {
		float average = averageGrade();
		for (Student student:this.enrolledCourses.values()) {
			if(student.grade <= average) {
				System.out.println(student.firstName + " " + student.lastName + " is not above course average");
			}else {
				System.out.println(student.firstName + " " + student.lastName + " is above course average");
			}
		}
	}
	public String toString() {
		return "----------------------------------"	+ "\nCourse name: " + this.courseName + "\nProfessor name: " + this.professorName + "\nYear: " + this.year + "\nStudents enrolleds: \n" + this.enrolledCourses + "\n---------------------------------";
	}
	
}
