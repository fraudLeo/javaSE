public class MAIN {

    //没有static的变量
    int i = 10;

    //带有static的方法
    public static void doSome() {
        System.out.println("do Some!");
    }

    //不带有static的方法
    public void doOther() {
        System.out.println("do Other!");
    }

    //带有static的方法
    public static void method1(){

        //调用doSome
        //完整方式调用
        MAIN.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        MAIN m = new MAIN();
        m.doOther();
        //省略方式调用   [不存在]


        //访问i
        //完整方式访问
        System.out.println(m.i);
        //省略方式访问    [没有]
        //System.out.println(i);
    }

    //不带static的方法
    public void method2() {
        //调用doSome
        //完整方式调用
        MAIN.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        this.doOther();//调用实例方法,代表对象
        //省略方式调用
        doOther();

        //访问i
        //完整方式访问
        System.out.println(this.i);
        //省略方式访问
        System.out.println(i);
    }

    public static void main(String[] args) {
        //要求在这里编写程序调用method1
        //使用完整方式调用
        MAIN.method1();
        //使用省略方式调用
        method1();


        //要求在这里编写程序调用method2
        //使用完整方式调用
        MAIN m = new MAIN();
        m.method2();
        //使用省略方式调用  [不存在]

    }

}
