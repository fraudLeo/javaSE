/**
 * 关于java语言当中的this关键字:
 *  1. this是一个关键字,翻译为 这个
 *  2. this是一个引用 this是一个变量,this变量中保存了内存地址指向了自身.this存储在jvm堆内存java对象内部
 *  3. 创建100个java对象,每个this都有自己的地址
 *
 */
public class Customer {

    //姓名 [对内存的对象内部中存储,所以访问该数据的时候,必须先创建对象,通过引用的方式访问]
    private String name;



    public Customer() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //不带有static关键字的一个方法
    //顾客的购物行为
    //每一个顾客购物最终的结果是不一样的
    //所以    购物这个行为是属于对象级别的行为
    //由于每一个对象在执行购物这个动作的时候最终结果不同,所以购物这个动作必须有"对象参与"
    //重点: 没有 static 关键字的方法被称为 "实例方法"
    //重点: 没有 static 关键字的变量被称为 "实例变量"
    //注意: 当一个行为/动作执行的过程当中是需要对象参与的,那么则个方法一定要定义为 "实例方法" ,不要带static关键字
        //会出现下面的那种错误:  java: 无法从静态上下文中引用非静态 变量 name

    /**  关于   static
     * 1、static可以修饰变量和方法；
     *
     * 2、被static修饰的变量或者方法是独立于该类的任何对象，也就是说，这些变量和方法不属于任何一个实例对象，而是被类的实例对象所共享；
     *
     * 3、在类被加载的时候，就会去加载被static修饰的部分；
     *
     * 4、被static修饰的变量或者方法是优先于对象存在的，也就是说当一个类加载完毕之后，即便没有创建对象，也可以去访问。
     *
     * 简而言之 :staic 的地位位于对象之上 即使没有创建对象,也可以使用static里面的东西 这就是为什么 个人写一些小方法的时候喜欢用static
     *
     */
    public void shopping1 () {
        System.out.println("shopping method is invoked");
        System.out.println(name);
    }
    public static void shopping2 () {
        System.out.println("shopping method is invoked");
//        System.out.println(this.name);
    }
}
































































