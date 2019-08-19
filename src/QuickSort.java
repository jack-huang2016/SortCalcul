import java.util.Arrays;
import java.util.Stack;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {6, 23, 8, 56, 5, 3 , 4, 1};
		quickSortByStack(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	/**
	 * �������򣨷ǵݹ飩
	 *
	 * ��. ������������һ��Ԫ�أ���Ϊ"��׼"��pivot����
	 * ��. �����������У����бȻ�׼ֵС��Ԫ�ذڷ��ڻ�׼ǰ�棬���бȻ�׼ֵ���Ԫ�ذ��ڻ�׼���棨��ͬ�������Ե���һ�ߣ����������������֮�󣬸û�׼�ʹ������е��м�λ�á������Ϊ������partition��������
	 * ��. �ѷ���֮����������ı߽磨low��high��ѹ��ջ���棬��ѭ���١��ڲ���
	 * @param arr   ����������
	 */
	public static void quickSortByStack(int[] arr){
	    if(arr.length <= 0) return;
	    Stack<Integer> stack = new Stack<Integer>();

	    //��ʼ״̬������ָ����ջ
	    stack.push(0);
	    stack.push(arr.length - 1);
	    while(!stack.isEmpty()){
	        int high = stack.pop();     //��ջ���л���
	        int low = stack.pop();

	        int pivotIdx = partition(arr, low, high);

	        //�����м����
	        if(pivotIdx > low) {
	            stack.push(low);
	            stack.push(pivotIdx - 1);
	        }
	        if(pivotIdx < high && pivotIdx >= 0){
	            stack.push(pivotIdx + 1);
	            stack.push(high);
	        }
	    }
	}

	private static int partition(int[] arr, int low, int high){
	    if(arr.length <= 0) return -1;
	    if(low >= high) return -1;
	    int l = low;
	    int r = high;

	    int pivot = arr[l];    //�ڿ�1�������׼��ֵ
	    while(l < r){
	        while(l < r && arr[r] >= pivot){  //��2���Ӻ���ǰ�ҵ��Ȼ�׼С��Ԫ�أ����뵽��׼λ�ÿ�1��
	            r--;
	        }
	        arr[l] = arr[r];
	        while(l < r && arr[l] <= pivot){   //��3����ǰ�����ҵ��Ȼ�׼���Ԫ�أ��ŵ��ղ��ڵĿ�2��
	            l++;
	        }
	        arr[r] = arr[l];
	    }
	    arr[l] = pivot;   //��׼ֵ�����3�У�׼�����εݹ����
	    return l;
	}

}
