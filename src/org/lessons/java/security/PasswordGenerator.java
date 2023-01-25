package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String name;
		String lastname;
		String color;
		
		int birthDay;
		int monthDay;
		int yearBirthday;

		
		Scanner data = new Scanner(System.in);
		System.out.println("Dimmi il tuo nome");
		name = data.nextLine();
		System.out.println("Dimmi il tuo cognome");
		lastname = data.nextLine();
		System.out.println("Dimmi il tuo colore preferito");
		color = data.nextLine();
		System.out.println("Inserisci la tua data di nascita");
		System.out.println("Dimmi il giorno del tuo compleanno");
		birthDay = data.nextInt();
		System.out.println("Dimmi il mese del tuo compleanno");
		monthDay = data.nextInt();
		System.out.println("Dimmi l'anno del tuo compleanno");
		yearBirthday = data.nextInt();
		
		data.close();
		
		int sum = birthDay + monthDay + yearBirthday;
		
		String userPassword = name+"-"+lastname+"-"+color+"-"+sum;
		
		System.out.println("La tua password è" +" "+ userPassword );
		
		

	}

}
