import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {6, 8, 56, 5, 3 , 1};
		bubbleSort(a);
	}

	/**
	 * ð������
	 *
	 * ��. �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	 * ��. ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ��ⲽ���������Ԫ�ػ�����������
	 * ��. ������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 * ��. ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ����~�ۣ�ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	 * @param arr  ����������
	 */
	public static void bubbleSort(int[] arr){
	    for (int i = arr.length - 1; i > 0; i--) {      //���ѭ���ƶ��α�
	        for(int j = 0; j < i; j++){    //�ڲ�ѭ�������α꼰֮��(��֮ǰ)��Ԫ��
	            if(arr[j] > arr[j+1]){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                System.out.println("Sorting: " + Arrays.toString(arr));
	            }
	        }
	    }
	}
}
