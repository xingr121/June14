package class6;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double principle = 1000;
		double interestRate = 0.0625;
		int numOfYear = 5;
		double profitOfInves;
		profitOfInves = principle * Math.pow(1 + interestRate, numOfYear) - principle;

        System.out.println("The profit after " + numOfYear + " years is: " + profitOfInves);
		
		
	}

}
