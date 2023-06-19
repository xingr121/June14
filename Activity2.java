package class6;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = kb.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = kb.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
        kb.close();
	}

}
