/**
 * "中国人"类
 *
 * 什么时候成员变量声明为实例变量呢?
 *      - 所有对象都有这个属性
 * 什么时候成员变量声明为静态变量呢?
 *      - 所有对象都有这个属性
 *   静态变量在类加载的时候初始化,内存在方法区中开辟,访问的时候不惜要创建对象,直接使用 "类名.静态变量名"
 */
public class Chinese {

    //身份证号 [每一个对象的身份证号不同]
    //实例变量
    String id;

    //姓名 [每一个对象的姓名不同]
    //实例变量
    String name;

    //国籍 [每一个对象由于都是由"chinese类"实例化的 ,所以每一个中国人的国际都是"中国"]
    //无论通过chinese类实例化多少个java对象,这些java对象的国际都是"中国"
    //实例变量 [实例变量是一个java对象就有一份, 100个java对象,就有100个country],分析这种设计方式的缺点?
    //实例变量存储java对象内部,在堆内存中,在构造方法执行的时候初始化.
    //所有的中国人的国籍都是中国,在这里声明为实例变量显然是不合适的,太浪费内存空间,没必要让每一个对象都保留一份"国籍内存"

    //静态变量 静态变量在类加载的时候初始化,不需要创建对象了,内存就开辟了
    //在类加载的瞬间就加载了,放在了方法区里面,内存里面不会重复占用
    static String country;

    public Chinese() {
    }

    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Chinese(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
