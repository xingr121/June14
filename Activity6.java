package class6;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit = 300;
		System.out.println("Fibonacci numbers until 300 : ");
		int a = 0, b = 1, c = 0;
		while(c <= 300) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}
	
	}

}
