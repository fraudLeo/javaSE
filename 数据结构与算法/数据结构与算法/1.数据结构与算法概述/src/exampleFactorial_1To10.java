public class exampleFactorial_1To10 {
    public static void main(String[] args) {
        method1();//使用了递归,不仅耗时而且占内存
        method2();
    }

    private static void method1() {
        long res = util.fun1(10);
        System.out.println(res);

    }

    private static void method2() {
        long res = util.fun2(10);
        System.out.println(res);
    }

}
class util {

    public static long fun1(int n) {

        if (n==1) {
            return 1;
        }

        return n*fun1(n-1);
    }


    public static long fun2(int n) {
        long res = 1;
        for (int i = 0; i < n; i++) {
            res *=(i+1);
        }
        return res;
    }
}
