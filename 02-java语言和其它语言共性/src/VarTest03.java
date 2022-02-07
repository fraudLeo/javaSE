//关于成员变量和局部变量
public class VarTest03 {

    //i 就是成员变量
    int i = 100;

    public static void main(String[] args) {

        //i就是局部变量
        int i = 10;
        System.out.println("主方法里面的i是"+i);
        doSome();
    }


    //doSome方法
    public static void  doSome() {

        //局部变量
        int i = 1;
        System.out.println("doSome方法里面的i是"+i);
    }
}
