/*
    方法重载:
        1. 方法重载又被称为overload

        2. 什么时候考虑用啊方法重载?
            *功能相似的时候,尽可能让方法名相同
            但是: 功能不同的时候,尽可能让方法名不同

        3. 什么条件满足之后构成了方法重载?
            * 在同一个类中
            * 方法名相同
            * 参数列表不同:
                - 数量不同
                - 顺序不同
                - 类型不同
        4. 方法重载和什么有关系,和什么没关系?
            * 方法重载和方法名,参数列表有关
            * 方法重载和返回值类型无关
            * 方法重载和修饰符列表无关

 */
public class OverLoadTest02 {

    public static void main(String[] args) {}

    //以下两种方法构成重载-------数量不同
    public static void m1() {}
    public static void m1(int a) {}

    //以下两个方法构成重载-------顺序不同
    public static void m2(int a, double b) {}
    public static void m2(double a, int b) {}


    //以下两个方法构成重载-------类型不同
    public static void m3(int x) {}
    public static void m3(double y) {}

    //以下是错误示范---------方法重复
//    public static void m4(int x, int y) {}
//    public static void m4(int y, int x) {}
}

















