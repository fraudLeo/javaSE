package leo.algorithm.sort;

public class Merge {

    //成员变量，完成归并需要的辅助数组
    private static Comparable assist[];

    // 对数组内元素进行排序
    public static void sort(Comparable[] a) {

        //1. 定义辅助数组assist
        assist = new Comparable[a.length];
        //2. 定义一个lo变量,和hi变量,分别记录数组中国最小的索引和最大的索引
        int lo = 0;
        int hi = a.length-1;
        //3. 调用sort重载方法完成数组a中,从lo到hi的排序
        sort(a,lo,hi);
    }
    // 对数组a中 从索引 lo 到索引 hi 之间的元素进行排序
    private static void sort(Comparable[] a,int lo,int hi) {

        //安全性校验
        if (hi<=lo) {
            return;
        }
        //对数据进行分组
        int mid = lo+(hi-lo)/2;
        //分别对每一组进行排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //在把两个阻挡中的数据进行归并
        merge(a,lo,mid,hi);
    }
    // 从索引 lo 到索引 mid 为一个子组，从索引 mid+1 到索引 hi 为另一个子组，把数组 a
    // 中的这两个自组数据合并成一个有序的大组（从索引 lo 到索引 hi )
    private static void merge(Comparable[] a,int lo, int mid, int hi) {

        //定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;

        //便利,移动p1指针和p2指针,比较对应索引处的值,找出晓得哪个,放到辅助数组的对应索引处
        while(p1<=mid && p2<=hi) {
            if (less(a[p1],a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }

        //如果p1 的指针没有走完,那么顺序移动p1指针,把对应的元素放到辅助数组的对应索引处
        while(p1<=mid) {
            assist[i++] = a[p1++];
        }
        //如果p2 的指针没有走完,那么顺序移动p1指针,把对应的元素放到辅助数组的对应索引处
        while(p2<=hi) {
            assist[i++] = a[p2++];
        }
        //把辅助数组中的元素方道元数组中
        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }
    }
    //判断 v 是否小于 w
    private static boolean less(Comparable v,Comparable w) {
        return v.compareTo(w)<0;
    }
    //交换 a 数组中，索引 i 和索引 j 出的值
    private static void exch(Comparable[] a,int i, int j) {

        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
