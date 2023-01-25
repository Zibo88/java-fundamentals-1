package org.lessons.java.OS;

import java.util.Scanner;

public class sondaggioStudenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentNumber;
		byte studentWindows;
		byte studentLinux;
		byte studentMacOs;
		
		
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Quanti studenti hai nella tua classe?");
		studentNumber = data.nextInt();
		
		System.out.println("Quanti di questi usano Windows?");
		studentWindows = data.nextByte();
		
		System.out.println("Quanti di questi usano Linux?");
		studentLinux = data.nextByte();
		
		System.out.println("Quanti di questi usano MacOs?");
		studentMacOs = data.nextByte();
		
		int percentualeDiStudentiWindows = (studentWindows*100)/studentNumber ;
		int percentualeDiStudentLinux = (studentLinux*100)/studentNumber ;
		int percentualeDiStudentMacOs = (studentMacOs*100)/studentNumber ;
		
		System.out.println("la percentuale di studenti che utilizza Windows è del: " + " " + percentualeDiStudentiWindows+"%" );
		System.out.println("la percentuale di studenti che utilizza Linux è del: " + " " + percentualeDiStudentLinux+"%" );
		System.out.println("la percentuale di studenti che utilizza MacOs è del: " + " " + percentualeDiStudentMacOs+"%" );

		
		
		
		
		
	}

}
