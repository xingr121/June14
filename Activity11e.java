package class6;

public class Activity11e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int row = 5;
	    for (int i = 1; i < row; i++) {
			for (int k =i; k < row; k++) {
				System.out.print(" ");
			      }
		    for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				  }
				System.out.println();
				
			}
		
				
	    for (int i = 1; i <= row; i++) {
			for (int k =1; k < i; k++) {
					System.out.print(" ");
			      }
			for (int j = i; j <= row; j++) {
					System.out.print("* ");
				  }
					System.out.println();
				
			}
	}

}
