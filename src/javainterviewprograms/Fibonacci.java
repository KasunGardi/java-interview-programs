package javainterviewprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
Fibonacci series
Program to display any given number of integers of the Fibonacci series. 
In the Fibonacci series, each number is equal to the sum of the two 
numbers that precede it.
*/

public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number :");
		int value = scanner.nextInt();
		System.out.println("The Fibonacci Series :");
		List<Integer> list = getFibonacciSeries(value);
		list.forEach(element -> {
			System.out.print(element + " ");
		});
		
	}
	
	public static List<Integer> getFibonacciSeries(int value){
		List<Integer> list = new ArrayList<>();
		int x = 0;
		int y = 1;
		
		list.add(x);
		
		while(y <= value) {
			list.add(y);
			int temp = x;
			x = y;
			y = y + temp;
		}
		
		return list;
		
	}

}
