package Test;

import Object.User;
//这么写非常不安全
public class Test01 {

    public static void main(String[] args) {

        User user = new User();
//      容易遭到数据被恶意更改
        user.age = -10;

        int age = user.age;

        System.out.println(age);
        //没法输出,因为 tel 是 private,太过安全 外部无法修改;
//        System.out.println(user.tel);
    }
}
