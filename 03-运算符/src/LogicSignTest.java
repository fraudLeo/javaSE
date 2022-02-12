/**
 * 逻辑运算符:
 * &    逻辑与     都是true 才为true
 * |    逻辑或     只要有一个是true 就是true
 * !    逻辑非     取反
 * ^    逻辑异或    两边的算子只要结果不一样就是真
 *
 * &&   短路与
 * ||   短路或
 *
 * 逻辑运算符要求两边的算子都是布尔值类型,并且逻辑运算符最终的运算结果也是布尔值
 *
 * 短路与和逻辑与最终的运算结果是一样的 只不过短路与存在短路现象
 * 同理两个或
 *
 * 那什么情况下发生短路现象呢?
 *
 * 什么时候选择逻辑?什么时候选择短路呢?
 */
public class LogicSignTest {
    public static void main(String[] args) {
        System.out.println( (5 > 3) & (5 > 2) );//运算符优先级不确定,加小括号
        System.out.println( 5 > 3 & 5 > 6 );
        System.out.println( 5 > 2 | 5 > 6 );

        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);

//        逻辑与和短路与
        int x = 10;
        int y = 8;
        //逻辑与
        System.out.println( x < y && ++x < y );//
        System.out.println(x);//11  说明上面的表达式执行了

        //逻辑与
        System.out.println( x > y && ++x < y );//
        System.out.println(x);//10  说明上面的表达式没执行

        /**
         * 所以综上所示 只用短路就可以了  因为她一旦通过第一个参数判断了布尔值
         * 后面的就不执行了
         */

    }
}
