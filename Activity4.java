package class6;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val1 , val2 , val3 , val4;
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        val1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        val2 = kb.nextInt();
        System.out.print("Enter the third number: ");
        val3 = kb.nextInt();
        System.out.print("Enter the 4th number: ");
        val4 = kb.nextInt();
        
        int max = val1;
        if (val2 > max) {
        	max = val2;
        }
        if (val3 > max) {
        	max = val3;
        }
         if (val4 > max) {
        	max = val4;
        }
         System.out.println("the greatest number is : " + max);
	}

}
