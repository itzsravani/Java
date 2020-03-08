
public class PrimeNumbers {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			int counter=0;
			for(int num=1; num<=i;num++) {
				if(i%num==0) {
					counter++;
				}
				
			}
			if(counter==2) {
				System.out.print(i+" ");
			}
			
		}

	}

}
