/**
 * 关于java语言当中的多态语法机制 [只是堕胎的语法基础,多态的作用在后续的例子中讲解]
 * 1. Animal Cat Bird 三个类之间的关系
 *      Cat,Bird 继承Animal
 *      但是Cat和Bird没有任何继承关系
 *
 * 2. 面向对象三大特征: 封装,继承,多态.
 *
 * 3. 关于多态中涉及到的几个概念
 *      - 向上转型 (upcasting)
 *          - 子类型 --> 父类型
 *          - 又被称为自动类型转换
 *
 *      - 向下转型(downcasting)
 *          - 夫类型 --> 子类型
 *          - 又被称为强制类型转换  [要加强制类型转换符]
 *
 *      - 需要记忆的部分:
 *          无论是向上转型还是向下转型,都必须要有继承关系
 *          否则程序会编译错误
 */
public class Test01 {

    public static void main(String[] args) {

        //以前编写程序
        Animal a1 = new Animal();
        a1.move();

        Bird b1 = new Bird();
        b1.move();

        Cat c1 = new Cat();
        c1.move();
        c1.catchMouse();

        //使用多态语法机制

        /**
         * 1. Cat is A Animal
         * 2. Animal 和 Cat 直接按存在继承关系 ,Animal是父类 ,Cat是子类
         * 3. new Cat() 创建对象的类型是Cat, a2这个引用的数据类型是Animal,可见他们进行了类型转换
         *    子类型转换成夫类型 成为向上转型(upcasting/自动类型转换)
         * 4. Java允许这种语法 : 父类型引用指向子类型对象 向上转型
         */
        Animal a2 = new Cat();//表示Animal的引用只想Cat这个对象

        /**
         * 1. java程序永远分为编译阶段和运行阶段.
         * 2. 先分析编译阶段 在分析运行阶段 编译无法通过,根本是无法运行的
         * 3. 编译阶段编译器检查a2 这份引用类型的数据类型为Animal 由于 Animal.class
         * 字节码当中有move() 方法 所以编译通过了   这个过程我们成为静态绑定,编译阶段绑定
         * 只有静态绑定成功之后再有后续的运行
         * 4. 在程序运行阶段 JVM对内存当中正是创建的对象是Cat对象 那么以下程序在运行阶段
         *    一定会调用Cat对象的move方法 此事发生了程序的动态绑定 运行阶段绑定.
         * 5. 无论是Cat类有没有写Move方法 运行阶段一定调用的是Cat对象的move方法
         * 因为底层真实对象就是cat对象
         * 6. 夫类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态
         * 这种机制可以成为一种多态语法
         *
         *
         */
        a2.move();//底层对象还是Cat 如果cat里面注释掉 调用的move还是cat的move

        /**
         * 分析以下程序为什么不能调用?
         *      因为编译阶段编译器检查到a2 是Animal类型
         *      从Animal.class字节码文件中查找catchMouse方法没有找到
         *      最终没有找到 ,导致静态绑定成功 没有绑定成功,也就是说编译失败了
         *      别谈运行了
         */
//        a2.catchMouse();

        /**
         * 需求:
         *  假设想让以上的对象执行catchMouse() 方法 ,怎么办?
         *      a2 是无法直接调用的,因为a2 的类型是Animal animal中没有catchMouse()方法.
         *      我们可以将a2强制转换换成Cat类型
         *      a2 的类型是Animal(父类) 转换成Cat(子类) 被称为向下转型
         *      必须有继承关系
         *
         *      什么时候需要使用向下转型呢?
         *          当调用的方法狮子类型中特有的,在父类当中不存在,必须进行向下转型
         *
         */
        Cat c2 = (Cat) a2;
        c2.catchMouse();

        //父类型引用指向子类型对象 [多态]
        Animal a3 = new Bird();
        /**
         * 1. 以下程序编译阶段是没有问题的,因为编译器检查到a3的数据类型是Aanimal
         * Animal和Cat之间存在继承关系 并且Animal是父类型 Cat是子类型
         * 夫类型转换成子类型叫向下转型,语法符合
         *
         * 2. 程序虽然编译通过了 但是程序在运行阶段会出现异常,因为JVM堆内存
         *  当中真实存在的对象是Bird类型,Bird对象无法转换成Cat对象,因为两种
         *  类型之间不存在任何继承关系,此时出现了著名的异常 :
         *      java.long.ClassCastException
         *      类型转换一场,这种异常总是在向下转型的时候发生
         *
         */
//        Cat c3 = (Cat) a3;
        /**
         * 以上一场只有在强制类型转换的时候才会发生,也就是说,向下转型存在安全隐患
         * 向上转型 只要编译通过一定不会出问题
         * 所以怎么避免向下转型出现错误呢?
         *      - 使用 instanceof运算符 可以避免出现以上异常
         * instanceOf怎么使用?
         *      语法格式:
         *          引用instanceof数据类型名
         *      以上运算符的执行结果类型是布尔类型,结果可能是true/false
         *          假设:(a instanceof Animal)
         *          true 表示:
         *              a这个引用指向的对象是一个anumal类型
         *          false 表示:
         *              a这个引用指向的对象不是一个animal类型
         *
         */
        //当a3引用指向的对象确实是一个Cat的时候
        if (a3 instanceof Cat) {
            Cat c3 = (Cat) a3;
            c3.catchMouse();
        } else if (a3 instanceof Bird) {
            Bird b2 = (Bird) a3;
            b2.fly();
        }

    }
}



































