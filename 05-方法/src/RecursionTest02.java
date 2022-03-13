/*
    不是用递归,计算1~N的和
 */
public class RecursionTest02 {
    public static void main(String[] args) {

//        //1-4
//        int n = 4;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum+=i+1;
//        }
//        System.out.println("sum = " + sum);


        int n = 4;
        //下面三种都可以用
//        int retResult = sum(n);
//        System.out.println(retResult);
//        int res = useRecursion(0, n);
//        int res = useRS(n);
        int res = useRT(n);
        System.out.println(res);
    }


    //定义一个单独的方法,这是一个独立的功能,可以完成1~N的求和   [不是用递归]
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
      return sum;
    }

    //使用递归计算   第一种递归方式
    public static int useRecursion(int sum,int n) {
    while(n!=0) {
        useRecursion(sum+=n, --n);
    }
    return sum;
    }
    public static int useRS(int n) {
        int sum = 0;
        if (n!=0) {
            sum = n+useRS(n-1);
        }

        return sum;
    }
    public static int useRT(int n) {
        if (n==1) {
            return 1;
        }
        return n+useRT(n-1);
    }
}
