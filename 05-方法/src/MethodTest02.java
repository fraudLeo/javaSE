/*
    关于java语言中的方法:
        1.方法怎么定义的,语法结构:
            [修饰符列表] 返回值类型 方法名 (形式参数列表) {
                方法体;
                }
        2.对以上的语法结构进行解释说明:
            1 关于修饰符列表:
                * 暂不讲
                * 可选项 目前同意携程public static [以后讲]
                * 方法的 修饰符列表里面有 static这个关键字那么调用的时候直接
                    -类名.方法();
            2 返回值类型是void的时候 在方法体内部不能写 " return 值;"这样的语句
                但是可以写 "return;"
                方法遇到了 return 所在方法结束 并不是JVm结束 !
            3 方法名:
                * 只要是合法的标识符就行
                * 方法名最好见名知意
                * 方法名最好是动词
                * 方法名首字母要求小写, 后面每个首字母大写

            4 形式参数列表:
                * 形参是局部变量
                * 形参的个数可以是0-N 个
                * 形参之间用逗号隔开
                * 形参中起决定性作用的是形参的数据类型 形参的名字就是局部变量的名字
                * 
            5 方法体:
                java语句

                 */

import java.util.Scanner;

//public 表示的是公开的
//class 表示的是定义类
//MethodTest02 表示的是一个类名
public class MethodTest02 {//表示的是定义一个公开类,起名MethodTest03 由于是公开的类,所以源文件名必须:MethodTest01

    public static void main(String[] args) {//(String[] args) 这是形式参数列表，其中 String[] 是一种引用类型，args是一个局部变量的变量
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a+b));
    }

}