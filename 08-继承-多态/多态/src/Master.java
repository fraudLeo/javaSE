/**
 * 主人类
 */

//降低程序的耦合度 提高程序的扩展力[软件开发的一个恒重要的目标]
public class Master {

    /**
     * 喂养宠物方法
     */
    //这样的写法耦合度太高,不容易修改
//    public void feed(LittleCat c) {
//        c.eat();
//    }
//
//    public void feed(LittleDog d) {d.eat();}

    //当Master面向整个pet的时候,耦合度就低了
    //Master著人类面向的是一个抽象的Pet,不在面向具体的宠物
    //提倡: 面向抽象编程,不要面向具体编程
    //面向抽象编程的好处是耦合度低,扩展力强
    public void feed(Pet pet) {
        pet.eat();
    }
}
