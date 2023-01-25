package org.lessons.java.OS;

import java.util.Scanner;

public class SondaggioStudenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentNumber;
		int studentWindows;
		int studentLinux;
		int studentMacOs;
		
		
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Quanti studenti hai nella tua classe?");
		studentNumber = data.nextInt();
		
		System.out.println("Quanti di questi usano Windows?");
		studentWindows = data.nextInt();
		
		System.out.println("Quanti di questi usano Linux?");
		studentLinux = data.nextInt();
		
		System.out.println("Quanti di questi usano MacOs?");
		studentMacOs = data.nextInt();
		
		data.close();
		
		double percentualeDiStudentiWindows = ((double)studentWindows*100f)/studentNumber ;
		double percentualeDiStudentLinux = ((double)studentLinux*100f)/studentNumber ;
		double percentualeDiStudentMacOs = ((double)studentMacOs*100f)/studentNumber ;
		
		System.out.println("la percentuale di studenti che utilizza Windows è del: " + " " + percentualeDiStudentiWindows+"%" );
		System.out.println("la percentuale di studenti che utilizza Linux è del: " + " " + percentualeDiStudentLinux+"%" );
		System.out.println("la percentuale di studenti che utilizza MacOs è del: " + " " + percentualeDiStudentMacOs+"%" );
		
		
		
	}

}
