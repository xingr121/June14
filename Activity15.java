package class6;

import java.util.Scanner;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the grade: ");
		char grade = kb.next().charAt(0);
		grade = Character.toUpperCase(grade);
		
		String description = null;
		
		switch (grade) {
		case 'E' :
			description = "Excellent";
			break;
		case 'V' :
			description = "Very Good";
			break;	
		case 'G' :
			description = "Good";
			break;		
		case 'A' :
			description = "Average";
			break;		
		case 'F' :
			description = "Fail";
			break;	
		default :
			System.out.println("Invalid input.");
			break;
		}
		System.out.println("You have chosen: " + description);
		
		kb.close();
		
	}

}
