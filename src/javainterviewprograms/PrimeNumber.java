package javainterviewprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		String message = isPrime(number)? "Prime" : "Non Prime";
		System.out.println("The number is " + message);
	}
	
	public static boolean isPrime(int number) {
		 		 
		 if(number == 0 || number == 1) {
			 return false;
		 }
		 else if(number == 2) {
			 return true;
		 }
		 else if( number > 0 && number%2 != 0 ) {
			 for(int i = 2 ; i < number; i = 2*i+1) {
				 if(number % i == 0) {
					return false;
				 }
			 }
			 return true;
		 }
		 else {
			 return false;
		 }		 
	}

}
