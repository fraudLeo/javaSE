//动态规划
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
        double p = 1.0/n;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n; j++) {

                if (i<j) {
                    dp[i][j] = 0;
                }
                if (j==1) {
                    dp[i][j] = Math.pow(p,i-1);
                } else {
                    dp[i][j] = dp[i-1][j]*((j*1.0)/n)+dp[i-1][j-1]*(((n-j+1)*1.0)/n);
//                    dp[i][j] = dp[i-1][j]*(j/n)+dp[i-1][j-1]*((n-j+1)*1.0/n);
                }

            }

        }
        System.out.printf("%.4f",dp[m][n]);
    }

}









