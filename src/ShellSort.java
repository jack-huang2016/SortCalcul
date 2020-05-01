import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13 , 27, 49, 55, 4};
        shell_sort1(a);
        //shell_sort2(a);
    }

    /**
     * 希尔排序（百度百科官方版）
     */
    public static void shell_sort1(int[] arr) {
        System.out.println("排序之前：");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //希尔排序
        int d=arr.length;
        while(true)
        {
            d=d/2;
            for(int x=0;x<d;x++)
            {
                for(int i=x+d;i<arr.length;i=i+d)
                {
                    int temp=arr[i];
                    int j;
                    for(j=i-d;j>=0&&arr[j]>temp;j=j-d)
                    {
                        arr[j+d]=arr[j];
                    }
                    arr[j+d]=temp;
                }
            }
            if(d==1)
            {
                break;
            }
        }
        System.out.println();
        System.out.println("排序之后：");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 希尔排序（Wiki官方版）
     */
    public static void shell_sort2(int[] arr) {
        int gap = 1, i, j, len = arr.length;
        int temp;
        while (gap < len / 3)
            gap = gap * 3 + 1;      // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
        for (; gap > 0; gap /= 3) {
            for (i = gap; i < len; i++) {
                temp = arr[i];
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap){
                    arr[j + gap] = arr[j];
                    System.out.println(Arrays.toString(arr));
                }
                arr[j + gap] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
