/**
 * 最终结论:
 *      在带有static的方法当中不能 直接 访问实例变量和实例方法.
 *      因为实例变量和实例方法都需要对象的存在
 */
public class Test {

    //带有static
    //主方法
    public static void main(String[] args) {

        //调用doSome方法
        Test.doSome();

        //调用doSome方法
        doSome();

        //调用doOther方法
        //doOther是实例方法
        //实例方法调用必须有对象的存在
        //以下代码表示的含义: 调用对象的doOther方法
        //但是由于main方法中没有this的概念 所以以下方法不能调用
        //doOther();
        //this.doOther();

        Test test = new Test();
        test.doOther();
    }

    //带有static
    public static void doSome() {

        System.out.println("doSome is invoked!");
    }

    //实例方法
    public void doOther() {

        //this 表示当前对象
        System.out.println("doOther is invoked");
    }

    //实例方法
    public void run() {
        //run是实例方法 .调用run方法的一定是有对象存在的
        //一定是先创建了一个对象才能调用run方法
        System.out.println("run execute");
        //在大括号中的代码执行过程当中一定是存在 "当前对象"
        //也就是说这里一定是有 "this" 的
        //doOther是一个实例方法,实例方法调用必须有对象的存在
        //以下代码表示的含义就是: 调用当前doOther方法

        doOther();//真正的写法并不完全
        this.doOther();
    }
}








































