package leo.algorithm.selfTry.sort;

public class Selection {

    public static void sort(Comparable[] a) {

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j <=a.length-1; j++) {
                if (greater(a[i],a[j])) {
                    exch(a, i, j);
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
