public class MainTest {

    //public标识公开的,在任何位置都是可以访问的
    //static 表示静态的 使用 "类名." 的方式即可访问,不需要创建对象,就可以调用main方法
    //void 表示main方法执行结束之后不返回任何返回值
    //main是main方法的方法名
    //(String[] args)是main方法的形式参数列表

    public static void main(String[] args) {
        main(10);
        main("hello world");
    }

    public static void main(int i) {
        System.out.println(i);
    }

    public static void main(String str) {
        System.out.println(str);
    }
}
