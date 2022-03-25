package leo.algorithm.selfTry.sort;

public class Shell {
    public static void sort(Comparable[] a) {
        int h = 1;
        while(h<a.length) {
            h = 2*h+1;
        }
        for (;h>0;h/=2) {
            for (int i = 0; i < a.length-h; i++) {
                if (greater(a[i],a[i+h])) {
                    exch(a,i,i+h);
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
