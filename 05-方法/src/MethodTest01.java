/**
 * 一下的程序不使用方法 分析下程序的问题
 */
public class MethodTest01 {
    public static void main(String[] args) {

        //需求1 : 请编写程序计算10 和20 的和 并将结果输出
        int a = 10;
        int b = 20;
        System.out.println("a" + "b" + "=" + (a + b));

        //需求2 : 请编写666 和  999的和,并将结果输出
        int c = 666;
        int d = 999;

        System.out.println("c" + "d" + "=" + (c + d));

        //可以看得出上面两个代码有重复,多次反复写会感觉恒冗余
        //所以会有方法的出现

        CalculateNum(a,b);

    }

    static void CalculateNum(int Num1, int Num2) {
        System.out.println(Num1+Num2);
    }

  }
