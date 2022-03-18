package test;

import fangfa.Student;

/*
    对象的创建使用
 */
public class OOTest01 {
    public static void main(String[] args) {
        //通过一个类可以实例化N个对象
        //实例化对象的方法: new 类名();
        //new 是 java语言当中的一个运算符
        //new运算符的作用是创建对象,在JVM堆内存当中开辟新的内存空间
        //方法去内存: 在类加载的时候,class 字节码代码片段被加载到该内存空间当中.
        //栈内存(局部变量):方法代码片段在执行的时候,会给该方法分配内存空间,在栈内存中压栈
        //堆内存: new的对象在堆内存中储存
        //Student是一个引用数据类型
        //s是一个变量名
        //new Student() 是一个学生对象
        //s是一个局部变量 [在栈内存中存储]
        //什么是对象? new运算符在堆内存 中开辟
        //什么是引用? 引用是一个变量,只不过这个变量保存了另一个java对象的内存地址
        //java语言当中,程序员不能直接操作堆内存,java中没有指针,不想c语言
        //java语言当中,程序员只能通过 引用  去访问对内存当中对象内部的实例变量
        Student s = new Student();

//        访问实例对象变量的语法格式:
//        读取数据: 引用.变量名
//        修改数据: 引用.变量名 = 值
        int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        String stuAddr = s.addr;
        boolean stuSex = s.sex;
        System.out.println(stuNo+" "+ stuName+ " " +stuAge+" "+stuAddr+" "+stuSex+ " ");
        /*
            局部变量在栈内存中存储
            成员变量的实例变量在堆内存储存
            实例变量是一个对象一份
         */

        //编译报错 no这个实例变量不能直接采用 "类名"方式访问
        //因为no是实例变量 对象级别的变量 变量储存在java对象的内部 ,必须要先有对象
//        System.out.println(Student.no);
    }

}
