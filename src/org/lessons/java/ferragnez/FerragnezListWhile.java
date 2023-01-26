package org.lessons.java.ferragnez;

import java.util.Scanner;

public class FerragnezListWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner guestName = new Scanner(System.in);
		
		String[] invited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei" };
		String invitedName;
		String bodyGuardMessage = "Mi dispiace, non sei nella lista degli invitati.";
		
		
		System.out.println("Buonasera Signor*, il suo nome prego..");
		invitedName = guestName.nextLine();
		
		guestName.close();
		
		
		int check = 0;
		
		while(check < invited.length -1) {
			
				if(invitedName.equals(invited[check])) {
				
				bodyGuardMessage = "Benvenu*" + " " + invitedName + " " + "!";
			}
				
			check++;
			
		}
		
		System.out.println(bodyGuardMessage);
	}

}
