//鸟类
public class Bird extends Animal {

    //重写从父类继承过来的方法
    public void move() {
        System.out.println("Bird is flying!");
    }
    //子类对象特有的方法
    public void fly() {
        System.out.println("flying!");
    }
}
