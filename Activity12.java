package class6;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int num = kb.nextInt();
        
        for (int i = 1; i <= num; i++) {
        int cube = i * i * i;
        System.out.println("Number is : " + i + " and cube of the " + i + " is : " + cube);
	}
	}
}
