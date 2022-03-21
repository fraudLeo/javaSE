/**
 * 可以使用static关键字来定义 "静态代码块":
 *      1. 语法格式:
 *          static {
 *              java语句;
 *          }
 *      2. 静态代码块在类加载时执行,并且只执行一次.
 *      3. 静态代码块可以在一个类中编写多个 ,并且遵循自上而下的顺序依次执行
 *      4. 静态代码块的作用是什么?怎么用?用在哪儿?什么时候用?
 *          - 这当然喝酒的需求有关,例如项目要求在类加载的时候执行代码完成日志的记录.
 *          那么这段记录日志的代码就可以编写到静态代码块当中,完成日志记录.
 *          - 静态代码块是java为程序员准备的的一个特殊时刻,这个特殊的时刻被称为类加载时刻.
 *          若希望在此刻执行一段特殊的程序,这段程序可以直接放到静态代码块里面
 *      5. 通常在静态代码块当中完成预备工作,先完成数据的准备工具,例如:初始化连接池,解析xml配置文件.....
 */
public class StaticTest01 {

    static {
        System.out.println("类加载-->1");
    }
    static {
        System.out.println("类加载-->2");
    }
    static {
        System.out.println("类加载-->3");
    }
    static {
        System.out.println("类加载-->4");
    }

    public static void main(String[] args) {
        System.out.println("main begin");
    }

}
