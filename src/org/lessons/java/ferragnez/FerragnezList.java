package org.lessons.java.ferragnez;

import java.util.Scanner;

public class FerragnezList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di 
//		assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo 
//		al post) Consegna: creare un progetto java-festa-ferragnez con il package 
//		com.ferragnez.party, a cui aggiungere la classe CheckGuest Nel programma bisogna: 
//		creare e inizializzare l’array contenente i nomi degli invitati chiedere all’utente 
//		come si chiama verificare che il nome sia presente nella lista lasciarlo entrare o 
//		rispedirlo cortesemente da dove è venuto :occhiali_da_sole: Bonus se avete usato il 
//		ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso 
//		programma usando il ciclo while, e viceversa Buon lavoro e buon weekend! 
//		:faccia_leggermente_sorridente: :tada: Lista invitati: Dua Lipa, Paris Hilton, 
//		Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, 
//		Martina Maccherone, Rachel Zeili
//			
		Scanner guestName = new Scanner(System.in);
		
		String[] invited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei" };
		String invitedName;
		String bodyGuardMessage = "";
		
		
		System.out.println("Buonasera Signor*, il suo nome prego..");
		invitedName = guestName.nextLine();
		
		guestName.close();
		
		for(int i = 0; i < invited.length -1; i++) {
			
			String nameList = invited[i];
			
			if(invitedName.equals(nameList)) {
				bodyGuardMessage = "Benvenut*";
			}else if(invitedName.equals(nameList)) {
				bodyGuardMessage = "ma ndo vai?";
			}
			
		}
		
		
		
		System.out.println(bodyGuardMessage);
		
		
	}

}
