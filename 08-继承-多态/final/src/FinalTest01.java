/**
 * 关于java语言当中final关键字:
 *      1. final是一个关键字,表示最终的,不可变的.
 *      2. final修饰的类无法被继承
 *      3. final修饰的方法无法被覆盖
 *      4. final修饰的变量一旦赋值之后不可重新赋值
 *      5. final修饰的实例变量???
 */
public class FinalTest01 {

    //成员变量之实例变量
    //实例变量有默认值 再加上final修饰的变量一旦赋值就不能重新赋值
    //所以定义实例变量的时候一定要赋值
    final int age = 1;
    //当然也可以用封装来进行赋值
    final int num;
    public FinalTest01() {
        this.num = 200;
    }
    public static void main(String[] args) {

        int i = 10;
        System.out.println(i);
        final int k = 100;
        System.out.println(k);
//        k = 1;// 会报错 无法为最终变量k 分配值

        A a = new A();

        //上面的代码在程序执行完下面那行就已经变成了数据垃圾,等垃圾回收器的回收
        a = new A(5);

//        但是下面的永远不会发生变化
        final A b = new A();


    }
}
