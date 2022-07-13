package javainterviewprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciRecursion {
	
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
		int n0 = 0;
		int n1 = 1;
		list.add(n0);
		getFibonacciSeries(n0, n1, list, value);
		return list;
	}
	
	public static void getFibonacciSeries(int n0, int n1, List<Integer> list, int value) {
		
		if(n1 <= value) {
			list.add(n1);
			int temp = n1;
			n1 = n1 + n0;
			n0 = temp;
			getFibonacciSeries(n0, n1, list, value);
		}
	}

}
