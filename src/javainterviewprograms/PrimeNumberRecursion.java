package javainterviewprograms;

import java.util.Scanner;

public class PrimeNumberRecursion {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		String message = isPrime(number,number-1)? "Prime" : "Non Prime";
		System.out.println("The number is " + message);
	}
	
	public static boolean isPrime(int number, int divisor) {
		
		if(number <= 1) {
			return false;
		}
		else if(number == 2) {
			return true;
		}
		else if(divisor == 1) {
			return false;
		}
		else if(number%divisor == 0) {
			return false;
		}
		else {
			return isPrime(number, divisor-1);
		}
		
	}
}
