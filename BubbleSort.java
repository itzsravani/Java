import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {2,3,10,8,4};
		System.out.println("Before Sorting: "+Arrays.toString(array));
		bubblesort(array);

	}

	private static void bubblesort(int[] array) {
		int temp=0;
		
		for( int i=0;i<array.length;i++){
			for(int j=i;j< array.length-i;j++){
				if(array[j]> array[j+i] ) {
					temp = array[j];
					array[j] =array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting:"+Arrays.toString(array));
		
	}

}
