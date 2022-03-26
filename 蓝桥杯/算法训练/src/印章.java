package src;//动态规划
//https://blog.csdn.net/okok__TXF/article/details/121099645
//100
import java.util.Scanner;

public class 印章 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();//种类
        m = scanner.nextInt();//数量
        double[][] dp = new double[25][25];
        double p = 1.0/n;//每次抽的概率
        for (int i = 1; i <= m; i++) {//数量
            for (int j = 1; j <=n; j++) {//种类

                if (i<j) {//抽的数量小于种类
                    dp[i][j] = 0;
                }
                if (j==1) {//抽一种
                    dp[i][j] = Math.pow(p,i-1);//   dp[1][1] = 1  dp[2][1] = 1.0/n dp[3][1] =

                } else {
                    System.out.println(dp[i-1][j]+" " + (j*1.0)/n + " "+ "||" + (i-1)+" " + (j-1) +" "+dp[i-1][j-1]+ " " + ((n-j+1)*1.0)/n);
                    dp[i][j] =  dp[i-1][j]*((j*1.0)/n)   +   dp[i-1][j-1]*(((n-j+1)*1.0)/n);
//                    dp[i][j] = dp[i-1][j]*(j/n)+dp[i-1][j-1]*((n-j+1)*1.0/n);
                }

            }

        }
        System.out.printf("%.4f",dp[m][n]);
    }

}









