package org.generation;

import java.util.ArrayList;
import java.util.List;

import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> listStudent = new ArrayList<Student>();
		Student pedro = new Student("Pedro", "Mayer", 12, 80, 0);
		Student pepe = new Student("Jose", "Rivera", 100);
		Student kim = new Student("Kimberly", "Pineda");
		
		System.out.println(pedro);
		pedro.changeYearIfApproved();
		System.out.println(pedro);
		
		listStudent.add(pedro);
		listStudent.add(pepe);
		listStudent.add(kim);
		
		Courses historia = new Courses("Historia 1", "Juan Perez", 0);
		historia.enroll(kim);
		historia.enroll(pepe);
		historia.enroll(pedro);
		
		System.out.println("La mejor nota es " + historia.bestGrade() );
		System.out.println("Hay " + historia.countStudents() + " alumnos inscritos");
		
		historia.unEnroll(kim);
		System.out.println("Hay " + historia.countStudents() + " alumnos inscritos");
		
		Courses mate = new Courses("Matematicas 1", "Miguel Trujillo", 0);
		mate.enroll(listStudent);
		System.out.println("Hay " + mate.countStudents() + " alumnos inscritos");
		System.out.println("La mejor nota es " + mate.bestGrade() );
		
		System.out.println("La nota promedio del curso es " + mate.averageGrade() );
		
		System.out.println(mate);
		mate.aboveCourseAverage();
	}

}
