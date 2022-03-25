package leo.algorithm.sort;

public class Quick {

    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length-1;
        sort(a,lo,hi);

    }

    private static void sort(Comparable[] a, int lo,int hi) {

        //安全性校验
        if (hi<=lo) {
            return;
        }
        //返回的是分解治所在的索引
        int partition = partition(a,lo,hi);

        //让左子组有序
        sort(a,lo,partition-1);
        //右
        sort(a,partition+1,hi);

    }

    public static int partition(Comparable[] a,int lo,int hi) {

        //确定分界值
        Comparable key = a[lo];
        //定义两个指针
        int left = lo;
        int right = hi+1;

        //切分
        while(true) {

            //先从右往坐移动,移动right指针,找一个比分界值小的元素,然后停止
            while(less(key,a[--right])) {
                if (right==lo) {
                    break;
                }
            }
            //从坐往右移动,移动left指针,找一个比分界值小的元素,然后停止
            while(less(a[++left],key)) {
                if (left == hi) {
                    break;
                }
            }
            //判断left>=right 如果是,则证明元素扫描完毕,循环结束,如果不是,交换元素即可
            if (left>=right) {
                break;
            } else {
                exch(a,left,right);

            }
        }
        exch(a,lo,right);
        return right;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j) {

        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
