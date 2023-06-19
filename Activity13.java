package class6;

import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int numTerm = kb.nextInt();
        
        int term = 1;
        int sum = 0;
        int currentTerm = term ;
        
        for (int i = 1; i <= numTerm; i++) {
        	sum = sum + currentTerm;
        	
        	System.out.print(currentTerm);
        	
        	if (i < numTerm) {
        		System.out.print(" + ");
        	}
        	
        	term *= 10;
        	currentTerm += term;
        	
        	
        }
        System.out.println();
        System.out.println(" The sum is : " + sum);
	}

}
