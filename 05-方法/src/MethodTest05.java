//当返回值类型不是void的时候，要求方法碧玺保证百分百的执行“return 值；”
    /*
        深入return语句：
            * 带有return关键字的java语句只要执行，所在的方法执行结束。

            * 在同一个作用于当中，return 语句下面不能不安歇任何代码，因为这些代码永远都执行不到，会编译报错

            *在返回值为void 的方法中使用return； 语句    是为了结束方法 不是为了返回
     */
public class MethodTest05 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        System.out.println("m1 invoke");
        return;//表示的是方法的结束
    }
}
