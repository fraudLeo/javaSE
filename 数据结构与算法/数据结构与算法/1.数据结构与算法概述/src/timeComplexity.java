//THIS IS A DEMO
public class timeComplexity {
    public static void main(String[] args) {
     method1();//事后分析法 有弊端 依赖当前主机性能
        /**
         * 一个高级编程语言编写的成语在计算机上运行所消耗的时间取决于以下因素:
         *  1 算法采用的策略与方案
         *  2 编译产生的代码质量
         *  3 问题的输入规模 (输入量的多少)
         *  4 机器执行指令的速度
         */
     method2();//事前分析法 主要常用

    }

    private static void method1() {
        long start = System.currentTimeMillis();

/////////////////////应用代码 开始
        int sum = 0;
        int n = 100;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
////////////////////应用代码 结束

        long end = System.currentTimeMillis();
        System.out.println("timeSpend is :" + (end-start));
    }

    private static void method2() {


    }


}
