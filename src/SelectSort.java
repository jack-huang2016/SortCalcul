import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 76, 13 , 27, 49, 55, 4};
		selectionSort(a);
	}

	/**
	 * —°‘Ò≈≈–Ú
	 */
	public static void selectionSort(int[] arr){
	       for (int i = 0; i < arr.length - 1; i++) {    
	            int  min = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                  if (arr[min] > arr[j]) {
	                       min = j;
	                  }
	            }
	            if (min != i) {
	               int tmp = arr[min];
	               arr[min] = arr[i];
	               arr[i] = tmp;
	            }
	            System.out.println(Arrays.toString(arr));
	      }
	}
	
}
