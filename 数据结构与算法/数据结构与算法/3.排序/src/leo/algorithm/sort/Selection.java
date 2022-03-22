package leo.algorithm.sort;

public class Selection {
    /*
        对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a) {

        for (int i = 0; i <= a.length - 2; i++) {
            int minIndex = i;
            for (int j = i+1; j <= a.length-1; j++) {
                //需要比较最小索引minIndex处的值和索引处的值
                if (greater(a[minIndex],a[j])) {
                    minIndex = j;
                }
            }

            //交换最小元素所在索引minIndex处的值和索引i处的值
            exch(a,i,minIndex);
        }

    }

    /*
        比较元素v是否大于w
     */
    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w)>0;
    }

    /*
        交换位置
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
