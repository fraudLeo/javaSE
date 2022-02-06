package differenceBTWclassAndpublic_class;

class A{
    public static void main(String[] args) {
        System.out.println("A's method is invoked");
    }
}
class B{
    public static void main(String[] args) {
        System.out.println("B's method is invoked");
    }
}
class C{
    public static void main(String[] args) {
        System.out.println("C's method is invoked");
    }
}



public class K {
    public static void main(String[] args) {
        System.out.println("K's method is invoked");
    }
}
//下面会报错,而上面的class 不会
/**
 * 一个Java源文件里面可以定义多个class
 * 但是值可以定义一个public class
 * 一个class会对应生成相对应的.class字节码文件
 * 之后想执行哪一个文件就相对用的run互相之间暂时没有干扰
 * 如果对应类里面没有主方法入口,则会报错
 */
//public class N {}
