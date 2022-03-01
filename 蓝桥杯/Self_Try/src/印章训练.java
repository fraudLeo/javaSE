import java.util.Scanner;

public class 印章训练 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//种类==》j
        m = sc.nextInt();//总数==》i
        double p = 1.0/n;
        double[][] dp = new double[25][25];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i<j) {
                    dp[i][j] = 0;
                }
                if (j==1) {
                    dp[i][j] = Math.pow(p,i-1);
                } else {
                    dp[i][j] = dp[i-1][j] * (j*1.0/n) + dp[i-1][j-1] * ((n-j+1)*1.0/n);
//                    System.out.printf("%.4f"+"\n",dp[i][j]);
                }
            }

        }
        System.out.printf("%.4f",dp[m][n]);
    }
}
