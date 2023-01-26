package org.lessons.java.favoriteFruits;

import java.util.Scanner;

public class ClassificaFrutti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cibi preferiti: Nel programma inizializzate un array (con i metodi visti a lezione) 
//		con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi) 
//		Poi stampate a video: - la lunghezza della classifica - il vostro cibo top 
//		(prima posizione della classifica) - il vostro cibo preferito ma non troppo 
//		(ultima posizione della classifica) Le modalità di consegna sono le solite: 
//			repo GitHub, file .gitignore, commit e push BONUS Stampate a video anche 
//			il cibo di mezza classifica, cioè che si trova nella posizione mediana
		
		Scanner data = new Scanner(System.in);
		
		String[] fruits = {"pesca", "melone", "fragola", "arancia", "ciliegia", "JanckFruit", "HubbleFruit"};
		
		int mediana = fruits.length / 2;
		
		
		
		
		
	
		System.out.println("Frutto preferito:" + " " + fruits[0]);
		System.out.println("Frutto meno preferito:" + " " + fruits[6]);
		System.out.println("Fruttomediano:" + " " + fruits[mediana]);
		
		
		
	}

}
