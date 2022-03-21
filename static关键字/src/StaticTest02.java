/**
 * 实例语句块/代码块 [了解内容,使用非常少]
 *
 *      实例代码块 就是  {代码;}   他会在构造方法创建对象的同时执行
 *      实例代码块可以编写多个,也是遵循自上而下的顺序依次执行
 *      实例代码块在构造方法之前执行,构造方法执行一次,实例代码块相对应执行一次
 *      实例代码块也是java语言为程序员准备一个特殊的实际,这个特殊的实际被称为:对象初始化实际
 */
public class StaticTest02 {

    //构造方法
    public StaticTest02() {
    }

    //实例代码块
    {
        System.out.println(1);
    }

    //实例代码块
    {
        System.out.println(2);
    }

    //实例代码块
    {
        System.out.println(3);
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        new StaticTest02();
        new StaticTest02();


    }
}
