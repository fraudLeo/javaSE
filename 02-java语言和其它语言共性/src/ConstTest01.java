/**
 * 关于字面值
 *      字面值:看到这个数据就知道这个数据,
 *          -10
 *          -100
 *          -"abc"
 *          -'a'// JAVA当中,所有的字符型字面值 必须用单引号括起来
 *          -true
 *          -false
 */
public class ConstTest01 {
    public static void main(String[] args) {
        System.out.println("abc");

        System.out.println("最近过得怎么样");

        System.out.println('a');

        System.out.println(10);

        System.out.println(false);

        System.out.println(3.14);

        /**
         * 下面两个都是访问的100
         * 100是一个字面值,是一个整数型的数值,
         * 那么既然是数据存储在内存当中必然有一个地址
         * 下面两次输出访问的字面值不是同一个地址.
         */
        System.out.println(100);
        System.out.println(100);

    }
}
