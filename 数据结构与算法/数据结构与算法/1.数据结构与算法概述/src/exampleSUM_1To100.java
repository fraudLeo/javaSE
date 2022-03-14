public class exampleSUM_1To100 {
    public static void main(String[] args) {
       method1();
       method2();//占用更少时间,更少内存
    }

    private static void method1() {
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    private static void method2() {
        int sum = 0;
        int n = 100;
        sum = (n+1)*n/2;
        System.out.println(sum);
    }
}
