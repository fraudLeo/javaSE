public class TREST {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        int[] a = {1,11,1};
        fn(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
    static void fn(int[] a){
        a[1] = 9;
        a[2] = 88;
    }
}
