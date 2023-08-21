package school;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student Student = new student();
		
		double x = 0;
		System.out.println("Informe o nome do aluno");
		Student.name = sc.nextLine();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite as tres notas: ");
			 x = x + sc.nextDouble();
		}
		
		Student.calculeGrades(x) ;
		
		System.out.println("FINAL GRADE = " + x);
		System.out.println(Student.condition);
	}
}
