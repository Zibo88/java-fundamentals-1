package org.lessons.java.bigliettoTreno;


import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data= new Scanner(System.in);
		
		int userKm;
		int userAge;
		float priceForKm = 0.21F;

		float underAgeDiscount = 0.20F;
		float overAgeDiscount = 0.40F;
		
		
		System.out.println("Quanti km vuoi percorrere?");
		userKm = Integer.parseInt(data.nextLine());
		
		System.out.println("Quanti anni hai?");
		userAge = Integer.parseInt(data.nextLine());
		
		
		float ticketPriceDefault = priceForKm*userKm;
		float discountPriceUnderage = ticketPriceDefault -(ticketPriceDefault*underAgeDiscount);
		float discountPriceOverage = ticketPriceDefault -(ticketPriceDefault*overAgeDiscount);
		
		
		
		data.close();
		
		if(userAge < 18) {
			System.out.println("prezzo categoria minore:" + " " + String.format("%.2f", discountPriceUnderage));
		}else if(userAge > 65){
			System.out.println("prezzo categoria over:" + " " +  String.format("%.2f", discountPriceOverage) );
		}else{
			System.out.println("prezzo:" + " " +  String.format("%.2f", ticketPriceDefault));
		}
		



	}

}
