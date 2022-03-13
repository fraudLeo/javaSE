/*
    方法重载:
        再调用方法的时候就像在使用一个方法一样
        优点:
            程序员在调用方法的时候,比较方便虽然调用的是不同的方法,但是就感觉在使用一个方法一样.
 */
public class OverloadTest01 {


    public static void main(String[] args) {
        System.out.println(sum(1,2));//参数的类型不同,对应调用的方法不同.此时区分方法不再依靠方法名,而是参数实际类型
        System.out.println(sum(1L,2L));
        System.out.println(sum(1.0,2.0));
    }
    public static int sum(int a,int b) {
        return a+b;
    }

    public static long sum(long a,long b) {
        return a+b;
    }

    public static double sum(double a,double b) {
        return a+b;
    }
}
