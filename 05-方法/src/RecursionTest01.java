/*
    1. 什么是递归
        方法自身调用
          a() {
            a();
          }
    2. 递归是很耗费内存的, 可以不用的时候尽量别用

    3. 运行下面程序的时候发生了这样一个错误: [  不是异常  是错误 ERROR]:
        Java.lang.StackOverflowError
        栈内存一处错误
        错误无法返回结果--->jvm停止运行
     4. 递归必须有结束条件,没有结束条件一定会发现栈内存溢出
 */


public class RecursionTest01 {
    public static void main(String[] args) {

        System.out.println("main begin");
        doSome();
        System.out.println("main over");
    }

    public static void doSome() {
        System.out.println("doSome begin");
        doSome();//没每次到这边都会再次执行doSome方法
        System.out.println("doSome over");
    }
}
