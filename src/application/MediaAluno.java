package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class MediaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.tri1 = sc.nextDouble();
		student.tri2 = sc.nextDouble();
		student.tri3 = sc.nextDouble();
		System.out.println("FINAL GRADE: " + student.finalGrade());		
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.faltaPoints());
			}
			else {
			System.out.println("PASS");
			}
		
			
		
		sc.close();

	}

}
