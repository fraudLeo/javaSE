 package test;

import fangfa.User;

public class OOTest02 {
    public static void main(String[] args) {
        //创建User对象
        //user 是一个局部变量
        //user是一个引用
        //user保存内存地址指向对内存的User对象
        User user = new User();

        //输出User对象内部实例变量的值
        System.out.println(user.no);
        System.out.println(user.name);
        System.out.println(user.addr);

        //修改User对象内部实例变量的值
        user.no = 110;
        //一般如果要在堆内存中开辟空间,必须要new
        //但是 String 字符串是个例外
        user.name = "jack";



    }
}
