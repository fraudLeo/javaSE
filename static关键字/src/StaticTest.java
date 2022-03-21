/**
 * 方法什么时候定义为静态的?
 *      方法描述的时动作,当所有对象执行这个动作的时候,最终产生的影响是一样的,那么
 *      这个动作已经不再属于某一个对象的动作了,可以将这个动作提升为类级别的动作,模板,
 *      级别的动作
 *
 * 静态方法中无法直接访问实例变量和实例方法
 * 大多数方法都定义为实例方法,一般一个行为或者一个动作再发生的时候,都需要 对象的参与
 */
public class StaticTest {

    //实例变量
    int i = 10;

    //实例方法
    public void fn() {
        System.out.println(i);
    }

    //静态方法[静态上下文]
    public static void main(String[] args) {

        System.out.println(new StaticTest().i);
//        new StaticTest.fn();

    }
}


/**
 * 总结:
 *      class类 {
 *          静态代码;
 *          实例代码块;
 *
 *          静态变量;
 *          实例变量;
 *
 *          构造方法;
 *
 *          静态方法;
 *          实例方法;
 *      }
 */