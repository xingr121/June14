package class6;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = kb.nextLong();

        long minutesInYear = 365 * 24 * 60;
        long minutesInDay = 24 * 60;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        kb.close();
	}

}
