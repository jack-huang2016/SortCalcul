import java.util.Arrays;

public class MergingSort {

	public static void main(String[] args) {
		int[] a = {6, 23, 8, 56, 5, 3 , 4, 1};
		mergingSort(a);
		System.out.println(Arrays.toString(a));
	}

	/**
	 * �鲢���򣨵ݹ飩
	 *
	 * ��. ������ÿ�����������ֽ��й鲢�������γ� floor(n/2)�����У������ÿ�����а�������Ԫ�أ�
	 * ��. �����������ٴι鲢���γ� floor(n/4)�����У�ÿ�����а����ĸ�Ԫ�أ�
	 * ��. �ظ�����ڣ�ֱ������Ԫ��������ϡ�
	 * @param arr    ����������
	 */
	public static int[] mergingSort(int[] arr){
	    if(arr.length <= 1) return arr;

	    int num = arr.length >> 1;
	    int[] leftArr = Arrays.copyOfRange(arr, 0, num);
	    int[] rightArr = Arrays.copyOfRange(arr, num, arr.length);
	    System.out.println("split two array: " + Arrays.toString(leftArr) + " And " + Arrays.toString(rightArr));
	    return mergeTwoArray(mergingSort(leftArr), mergingSort(rightArr));      //���ϲ��Ϊ��С��Ԫ��������ϲ�
	}

	private static int[] mergeTwoArray(int[] arr1, int[] arr2){
	    int i = 0, j = 0, k = 0;
	    int[] result = new int[arr1.length + arr2.length];  //�������Ŀռ�洢�ϲ�֮�������
	    while(i < arr1.length && j < arr2.length){      //ѡȡ���������еĽ�Сֵ����������
	        if(arr1[i] <= arr2[j]){
	            result[k++] = arr1[i++];
	        }else{
	            result[k++] = arr2[j++];
	        }
	    }
	    while(i < arr1.length){     //����1�ж����Ԫ������������
	        result[k++] = arr1[i++];
	    }
	    while(j < arr2.length){     //����2�ж����Ԫ������������
	        result[k++] = arr2[j++];
	    }
	    System.out.println("Merging: " + Arrays.toString(result));
	    return result;
	}
}
