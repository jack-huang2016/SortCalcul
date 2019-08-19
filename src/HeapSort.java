
public class HeapSort {

	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 76, 13 , 27, 49, 55, 4};
		heapSort(a);
	}

		/**
	    * ������
	    * @param array ����������
	    * @return ����������
	    */
	    public static int[] heapSort(int[] array) {
	        //����Ԫ�ص������Ǵ�0��ʼ��,�������һ����Ҷ�ӽ��array.length/2 - 1
	        for 	(int i = array.length / 2 - 1; i >= 0; i--) {  
	            adjustHeap(array, i, array.length);  //������
	        }
	 
	        // �����߼������ѽ���
	        // ���棬��ʼ�����߼�
	        for (int j = array.length - 1; j > 0; j--) {
	            // Ԫ�ؽ���,������ȥ���󶥶�
	            // �Ѵ󶥶ѵĸ�Ԫ�أ��ŵ��������󣻻��仰˵������ÿһ�εĶѵ���֮�󣬶�����һ��Ԫ�ص����Լ�������λ��
	            swap(array, 0, j);
	            // Ԫ�ؽ���֮�󣬺������ʣ����һ��Ԫ�������ٿ������������ˡ�
	            // ������������Ҫ����ģ������Ѿ�ȥ���˲���Ԫ�صĶ��ˣ���Ҳ��Ϊʲô�˷�������ѭ�����ԭ��
	            // �����ʵ���������϶��£��������ҽ��е�����
	            adjustHeap(array, 0, j);
	        }
	        return array;
	    }
	 
	    /**
	    * ������������ؼ��ĵط�
	    * @param array �����
	    * @param i ��ʼ���
	    * @param length �ѵĳ���
	    */
	    public static void adjustHeap(int[] array, int i, int length) {
	        // �Ȱѵ�ǰԪ��ȡ��������Ϊ��ǰԪ�ؿ���Ҫһֱ�ƶ�
	        int temp = array[i];
	        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {  //2*i+1Ϊ������i��������(��Ϊi�Ǵ�0��ʼ��),2*k+1Ϊk��������
	            // ��k��ָ���ӽڵ������Ľڵ�
	            if (k + 1 < length && array[k] < array[k + 1]) {  //�����������,��������������������
	                k++;
	            }
	            //������ֽ��(�����ӽ��)���ڸ���㣬�����ֵ�Ľ���
	            if (array[k] > temp) {
	                swap(array, i, k);
	                // ����ӽڵ�����ˣ���ô�����ӽڵ�Ϊ�����������ܵ�Ӱ��,���ԣ�ѭ�����ӽڵ����ڵ������������ж�
	                i = k;  //��һ����������һ������ִ�е���������������������
	            } else {  //���ý�����ֱ����ֹѭ��
	                break;
	            }
	        }
	    }
	 
	    /**
	    * ����Ԫ��
	    * @param arr
	    * @param a Ԫ�ص��±�
	    * @param b Ԫ�ص��±�
	    */
	    public static void swap(int[] arr, int a, int b) {
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	    }
}
