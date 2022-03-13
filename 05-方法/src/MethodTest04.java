//不推荐一个java文件里面写多个类
/*
    分析以下程序的输出结果
 */
public class MethodTest04 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");

    }
    public static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    public static void m3 () {
        System.out.println("m3 begin");
        System.out.println("m3 over");
    }
}
