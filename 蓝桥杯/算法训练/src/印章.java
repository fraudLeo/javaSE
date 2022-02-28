//动态规划
//https://blog.csdn.net/okok__TXF/article/details/121099645
import java.util.Scanner;

public class 印章 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//种类
        int m = sc.nextInt();//总数
        Solution solution = new Solution(m,n);
        System.out.printf("%.4f",solution.porb());
    }
}
class Solution {
    int n,m;
    double dp[][] = new double[20][20];
    double P0;

    Solution(int m,int n) {
        this.n = n;
        this.m = m;
        P0 = 1.0/n;//每种出现的概率
        solve();
    }
    double porb() {
        return dp[m-1][n-1];
    }
    private void solve() {
        for (int i = 1; i <=m; ++i) {
            for (int j = 1; j <=n; ++j) {
                if (i<j) {
                    dp[i][j] = 0;
                }
                if (j==1) {
                    dp[i][j] = Math.pow(P0,i-1);
                } else {
                    dp[i][j] = dp[i-1][j]*(j*1.0/n)+dp[i-1][j-1]*((n-j+1)*1.0/n);
                }
            }
        }
    }



}
