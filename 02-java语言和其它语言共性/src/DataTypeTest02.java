/**
 * 八种基本数据类型当中char表示的现实世界中的问价,文字和计算机二进制
 * 之间默认情况下是不存在任何转换关系的
 *
 * 所以就出现了字符编码,文字和二进制之间的对照关系,被称为字符编码
    解码和编码的时候采用的是同一套对照表,不会出现乱码.
    当不是同一套对照表,才会出现乱码问题.
 * java 语言源代码采用的是Unicode 的编码方式, 所以 标识符可以用中文
 *
 *
 *
 * 关于八种基本数据类型的默认值:如下
 * -----------------------------
 * byte,short,int,long     0
 * float,double            0
 * boolean                 false(true = 1,false = 0)
 * char                    \u0000
 */
public class DataTypeTest02 {
    static int k = 100;
    static int x;//成员变量会自己有一个默认的初始值

    public static void main(String[] args) {
        System.out.println(k);
        System.out.println(x);
        //两个都能输出.

        //char存储两个字节,中文正好是两个字节,所以char可以存储中文
    }
}
