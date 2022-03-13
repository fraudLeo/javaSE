/*
    方法调用:
    1. 方法的修饰列表当中有static关键字
    2. 有的时候，类名可以省略，但前提是两个方法在同一个类里面
 */
public class MethodTest03 {
    public static void main(String[] args) {
        //调用方法
        MethodTest03.m();
        //对于方法的修饰夫列表当中有static关键字的： 类名可随意省略不写吗?
        m();

        //调用其他类[不是本类的]类中的方法
        //省略类名. 就会无法识别，因为这样只会在本类里面寻找
//        doOther()
        A.doOther();
    }

    private static void m() {
        System.out.println("m method execute!");
        //完整的方法
        MethodTest03.m2();
        //也可以省略
        m2();
        //这里需要加上前缀
        A.m2();
    }
    private static void m2() {
        System.out.println("m2 excute!");
    }
}
class A
{
    public static void doOther() {

        System.out.println("A's doOther method invoke!");

    }
    public static void m2() {
        System.out.println("A's m2 method invoke!");
    }
}
