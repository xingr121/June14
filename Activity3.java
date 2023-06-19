package class6;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner kb = new Scanner(System.in);
        System.out.print("Enter your grade number: ");
        double gradeNum = kb.nextDouble();
        char gra ;
        
        if (gradeNum < 25) {
        	gra = 'F';
        } else if (gradeNum >= 25 && gradeNum <45) {
        	gra = 'E';
        } else if (gradeNum >= 45 && gradeNum < 50) {
        	gra = 'D';
        } else if (gradeNum >= 50 && gradeNum < 60) {
        	gra = 'C';
        } else if (gradeNum >= 60 && gradeNum < 80) {
        	gra = 'B';
        } else  {
        	gra = 'A';
        }
        System.out.println("The corresponding grade is : " + gra);
	}

}
