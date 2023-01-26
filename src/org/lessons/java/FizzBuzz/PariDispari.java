package org.lessons.java.FizzBuzz;

public class PariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
//		FizzBuzz: Scrivi un programma che stampi i numeri da 1 a 100,ma per i multipli di 3 
//		stampi “Fizz” al posto del numero e per i multipli di 5 stampi Buzz. Per i numeri che 
//		sono sia multipli di 3 che di 5 stampi FizzBuzz.
		
		String FizzBuzz;
		String Buzz;
		String Fizz;
		
		
		for(int i=1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				FizzBuzz = Integer.toString(i);
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0) {
				Buzz = Integer.toString(i);
				System.out.println("Buzz");
			}else if(i % 3 == 0) {
				Fizz = Integer.toString(i);
				System.out.println("Fizz");
			}
			
			System.out.println(i);
		}
	}

}
