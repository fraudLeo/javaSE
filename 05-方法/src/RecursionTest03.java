/*
    先不使用递归 计算N的阶乘

 */
public class RecursionTest03 {

    public static void main(String[] args) {
        int n = 5;
        int retValue1 = method1(n);
        int retValue2 = method2(n);
        int retValue3 = method3(n);
        System.out.println(retValue3);
    }

    private static int method3(int n) {
        if (n==1) {
            return 1;
        }
        return n*method3(n-1);
    }

    private static int method2(int n) {
        int result = 1;
        if (n>=1) {
            result  = n*method2(--n);
        }
        return result;
    }

    private static int method1(int n) {
        int result = 1;
        for (int i = 1; i <=n; i++) {
            result *=i;
        }
        return result;
    }

}
