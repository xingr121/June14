package class6;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = kb.nextInt();
				
		while (num < 0) {
			System.out.println("Enter positive number: ");
			num = kb.nextInt();
		}
		int fact = 1;
		if(num == 0) {
			fact = 1;
		}
		for (int i = 1 ; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial of " + num + " is : " + fact );
		
		kb.close();
	}

}
