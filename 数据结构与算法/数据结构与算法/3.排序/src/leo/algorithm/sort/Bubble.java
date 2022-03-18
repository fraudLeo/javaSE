package leo.algorithm.sort;

public class Bubble {
    /*
        对元素进行排序
     */
    public static void sort(Comparable[] arr) {
        int arr_len = arr.length;
        for (int i = arr_len-1; i >0; i--) {
            for (int i1 = 0; i1 <i; i1++) {
                if (greater(arr[i1],arr[i1+1])) {
                    exch(arr,i1,i1+1);
                }
            }
        }
    }
    /*
        比较元素v 是否大于元素w
     */
    private static boolean greater (Comparable v,Comparable w) {

        return v.compareTo(w)>0;//后大于前 返回true
    }
    /*
        交换位置i,j
     */
    private static void exch (Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
