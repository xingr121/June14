package class6;

public class Activity11i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		//print the upper half of the pattern
		int space = row -1;
		for (int i = 1; i <= row; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int k = 1; k<= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print the lower half of the pattern
		space =1;
		for (int i=1; i<= row-1; i++) {
			for (int j=1; j <= space; j++) {
				System.out.print(" ");
			}
			space++;
			for(int k=1; k<=2*(row-i)-1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
