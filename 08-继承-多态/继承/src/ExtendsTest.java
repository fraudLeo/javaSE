/**
 * 关于java语言当中的继承:
 *  1. 继承是面向对象三大特征之一
 *  2. 继承的基本作用是: 代码的复用.但是击沉最重要的是 : 有了继承再有以后的覆盖和方法的多态
 *  3. 继承的语法格式:
 *          [修饰符列表] class 类名 extends 夫类名 {
 *              类体 = 属性 +方法;
 *          }
 *  4. java语言的继承只支持单继承 一个类当中不能继承很多类, 但是c++可以一对多
 *  5. 关于继承中的一些术语:
 *      B类继承A类,其中:
 *          A类称为: 父类,基类,超类,superclass
 *          B类称为: 子类,派生类,subclass
 *  6. 在java语言中子类继承父类的哪些数据呢?
 *      - 私有不继承
 *      - 构造方法不继承
 */
public class ExtendsTest {

    public static void main(String[] args) {

        CreditAccount cA = new CreditAccount();
        cA.setActno("001");
        cA.setBalance(-1000.0);
        cA.setCredit(0.99);
        System.out.println();
    }
}





























