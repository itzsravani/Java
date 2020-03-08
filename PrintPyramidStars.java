
public class PrintPyramidStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int k=1;k<=3-i;k++){
				   System.out.print(" ");
			   }
			for(int j=1;j<=i;j++) {
			   
				System.out.print("* ");
			}
			System.out.println();
		}

		
		
		
		int rows = 3, k = 0;

		for(int i = 1; i <= rows; ++i, k = 0) {
		    for(int space = 1; space <= rows - i; ++space) {
		        System.out.print("  ");
		}
		    while(k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		}
		    
		    System.out.println();
		}
		  
		
		
		
		
	}

}
  
    
    
    