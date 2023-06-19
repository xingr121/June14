package class6;

import java.util.Scanner;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int n = kb.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int mult = n * i;
			System.out.println(n + " X " + i + " = " + mult);
}
	}

}
