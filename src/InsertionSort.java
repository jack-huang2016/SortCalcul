import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {6, 23, 8, 56, 5, 3 , 4, 1};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

	/**
	 * ֱ�Ӳ�������
	 */
	public static void insertionSort(int[] arr){
        for( int i=0; i<arr.length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( arr[j-1] <= arr[j] )
                    break;
                int temp = arr[j];      //��������
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }
}
