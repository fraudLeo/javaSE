/**
 * 什么时候会出现空指针异常呢?
 *  空引用访问实例相关数据,因为实力相关的数据就是对象相关的数据,
 *  这些数据在访问的时候,必须有对象的参与,当空引用的时候,对象不存在,
 *  访问这些事例数据一定会出现空指针异常
 *
 * 实力相关的数据包括:
 *      实例变量[需要对象存在]
 *      实例方法[需要对象存在]
 */
public class Test1 {
    public static void main(String[] args) {

        Test1.doSome();
        doSome();

        Test1 t = new Test1();
        t.doSome();

        t = null;
        //这里并没有报空指针异常,说明这里的 引用.方法()
        //并没有使用到对象,她在自己执行的时候还是会改编成Test.doSome()
        //带static的方法 七世纪可以采用雷鸣的方式进行访问,也可以采用引用的方式访问
        //但是即使采用引用的方式区,实际上执行的时候和引用的指向对象无关
        t.doSome();
    }
    public static void doSome() {
        System.out.println("doSome is invoked");
    }
}
