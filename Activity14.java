package class6;

import java.util.Scanner;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = kb.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; n++) {
        System.out.print("Enter" + i + " number: ");
        int num = kb.nextInt();
        sum = sum + num;
		}
		
		double average = sum / n;
		
		System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        kb.close();
	}

}
