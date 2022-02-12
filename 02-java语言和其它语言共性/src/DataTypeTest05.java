/*
    关于基本数据类型之间的互相转换
        1. 八种数据类型,除了布尔值类型,其他都可以互相转换
        2. 小容量向大容量转换, 称为自动转换类型转换,容量从小到大排序
            byte < short < int < long < float < double < char
            任何浮点类型不管占用多少个字节,都比整数型容量大
            char 和 short 可表示的种类数量相同,但是char可以取得更大正整数
        3. 大容量转换成小容量 叫做强制类型转换,需要加强制类型转换符,程序才能通过编译
        但是在程序运行阶段可能会损失精度,所以谨慎使用
        4. 当整数字面值没有超出byte,short char的取值范围 可以直接赋值给byte,short, char类型的变量

        5. byte short int char 混合类型的时候 先各自转换成int 在做运算
        6. 多种数据类型混合运算,先转换成容量最大的那种类型在做运行.
 */
public class DataTypeTest05 {
    public static void main(String[] args) {

        //出现错误 因为1000 超出了byte的范围
        //byte a = 1000;
        byte a = 20;

        //变量不能重名
        //short a = 1000;
        short b = 1000;

        //正确 因为1000也是默认int的
        int c = 1000;

        //正确 因为小转大,并没有造成数据流失
        long d = c;
        //下面的就是错的
        //int e = d;
        // 下面是上面的改进
        int e = (int) d;//不过会造成数据流失

        //因为 java 中运算会转换成这一条语句中最大的类型,所以下面是正确的
        int f = 10/3;

        //声明10为long类型
        long g = 10;

        //出现错误,多个数值在运算过程中,会转换成容量最大的类型
        //以下示例最大的类型是double 而int是int 所以就会出席那 long(大)-->int(小)
        //的转换,将会出现精度丢失的问题
        //int h = g/3;   //可以强制转换 但是会丢失精度,所以采用long类型来接受
        long h = g/3;
        //出现精度损失问题,一下问题主要是优先级的问题
        //将g转换成int 然后又将int 类型的g转换成byte 最后byte类型和g 的3 运算
        //那么他的运算结果类型就是int 所以 int 赋值给byte 就出现了精度损失问题
        //byte h1 = (byte) (int)g/3;
        byte h1 = (byte) (int)(g/3);//正确

        //不能转换 因为还有优先级的问题
        //byte h2 = (byte) g/3;//这里只是将g转换成了byte


        double i = 10/3;
        System.out.println(i);//3.0  因为右边的int 值是3 在给上double值,就变成了3.0
        double i1 = 10.0/3;
        System.out.println(i1);//3.33333   因为有百年会变成double类型

    }
}
