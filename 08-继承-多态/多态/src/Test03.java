/**
 * 多态在实际开发中的应用  以主人喂养宠物为例
 *      1. 分析: 主任喂养 宠物这个场景要实现需要进行类型的抽象:
 *          - 主人 [类]
 *          - 主人可以喂养宠物,所以主人有喂养这个动作
 *          - 宠物 [类]
 *          - 宠物可以吃东西,所以宠物有吃东西这个动作
 *      2. 面向对象编程的核心:定义好类,然后将类实例化,给一个环境驱使一下,让各个对象之间协作起来形成一个系统
 *      3. 多态的作用是什么?
 *          降低耦合度,提高程序的扩展力
 *          能使用多态尽量使用多态
 *          父类型只想子类型对象
 *
 *     核心: 面对抽象编程,尽量不要面向具体编程
 */
public class Test03 {

    public static void main(String[] args) {
        //创建主人对象
        Master Leo = new Master();
        //创建猫对象
        LittleCat tom = new LittleCat();
        //主人喂养猫
        Leo.feed(tom);
        //创建猫对象
        LittleDog hu = new LittleDog();
        Leo.feed(hu);

        LittleSnake snake = new LittleSnake();
        Leo.feed(snake);
    }
}
