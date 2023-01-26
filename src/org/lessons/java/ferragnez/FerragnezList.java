package org.lessons.java.ferragnez;

import java.util.Scanner;

public class FerragnezList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//			
		Scanner guestName = new Scanner(System.in);
		
		String[] invited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei" };
		String invitedName;
		 String bodyGuardMessage = "Mi dispiace, non sei nella lista degli invitati.";
		
		
		System.out.println("Buonasera Signor*, il suo nome prego..");
		invitedName = guestName.nextLine();
		
		guestName.close();
		
		for(int i = 0; i < invited.length -1; i++) {
			
			String nameList = invited[i];
			
			 if(invitedName.equals(nameList)) {
	                bodyGuardMessage = "Benvenut* " + invitedName + "!";
	            }
		}
		
		System.out.println(bodyGuardMessage);
		
		
	}

}
