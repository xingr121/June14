package class6;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Multiplication Table:");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int mult = i * j;
				System.out.printf("%4d", mult);
			}
			System.out.println();
		}
	}

}
