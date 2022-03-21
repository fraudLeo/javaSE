//猫类
public class Cat extends Animal {

    //重写父类中的方法

    @Override
    public void move() {
        System.out.println("Cat is moving!");
    }

    //不是从父类继承过来的方法
    //这个方法是子类对象特有的方法
    public void catchMouse() {
        System.out.println("Cat is catching mouse");
    }
}
