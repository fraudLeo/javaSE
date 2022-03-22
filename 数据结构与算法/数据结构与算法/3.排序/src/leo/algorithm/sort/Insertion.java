package leo.algorithm.sort;

import java.util.Arrays;

public class Insertion {
    public static void sort(Comparable[] a) {

        for (int i = 1; i < a.length-1; i++) {
            for (int j = i; j >0 ; j--) {
                if (greater(a[j-1],a[j])) {
//                    System.out.printf("第%d个和第%d个发生改变\n",j,i);
                    exch(a,j-1,j);
                    System.out.println(Arrays.toString(a));
                } else {
                    break;
                }
            }
        }
    }

    public static boolean greater(Comparable v,Comparable w) {
        return v.compareTo(w)>0;
    }

    public static void exch(Comparable[] a,int i,int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
