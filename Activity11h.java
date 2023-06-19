package class6;

public class Activity11h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sp=3;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			sp--;
			for (int k=i; k>=1; k--) {
				System.out.print(k);
			}
			for (int l=2; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	  sp=1;
	  for (int i= 3;i>=1; i--) {
		  for (int j=1; j<=sp; j++) {
			  System.out.print(" ");
		  }
		  sp++;
		  for (int k=i; k>=1; k--) {
			  System.out.print(k);
		  }
		  for (int l=2; l<=i; l++) {
			  System.out.print(l);
		  }
		  System.out.println();
			  
	  }
			  
	}

}
