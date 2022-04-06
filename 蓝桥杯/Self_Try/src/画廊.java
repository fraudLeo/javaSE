import java.util.Scanner;

public class 画廊 {
    static int maxn = 512;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        double[][][] dp = new double[maxn][maxn][2];
        int[] u = new int[maxn];
        int[] v = new int[maxn];
        //The number of paintings on the left
        int L = in.nextInt();
        //The number of paintings on the right
        int R = in.nextInt();
        //the length of the gallery
        int d = in.nextInt();
        //the width of the gallery
        int w = in.nextInt();
        //the location of the paints on left
        for (int i = 1; i <=L ; i++) {
            u[i] = in.nextInt();
        }
        //the location of the paints on right
        for (int i = 1; i <=R ; i++) {
            v[i] = in.nextInt();
        }

        //i means the ID of the left paint
        //j means the right's
        //the third parameter means whether the pointer is on left or right
        //0 represents left  1 represents right
        //the following is an initialization
        for (int i = 0; i <=L ; i++) {
            for (int j = 0; j <= R; j++) {
                dp[i][j][0] = Integer.MAX_VALUE;
                dp[i][j][1] = Integer.MAX_VALUE;
            }
        }

        //start from left
        dp[1][0][0] = hypot(w / 2.0,u[1]);
        //start from right
        dp[0][1][1] = hypot(w / 2.0,v[1]);


        for (int i = 0; i <= L; i++) {//traverse the left wall
            for (int j = 0; j <= R; j++) {//traverse the right wall
                if (i + j > 1){
                    if (i != 0){
                        dp[i][j][0] = Math.min(
                                dp[i - 1][j][0] + u[i] - u[i - 1],
                                dp[i - 1][j][1] + hypot(w, Math.abs(u[i] - v[j])));
                    }
                    if (j != 0) {
                        dp[i][j][1] = Math.min(
                                dp[i][j - 1][1] + v[j] - v[j - 1],
                                dp[i][j - 1][0] + hypot(w, Math.abs(u[i] - v[j])));
                    }
                }
            }
        }
        System.out.printf("%.2f",Math.min(dp[L][R][0] + hypot(w / 2.0, d - u[L]),
                dp[L][R][1] + hypot(w / 2.0, d - v[R])));
    }

    //calculate the distance
    private static double hypot(double v, double i) {
        return Math.sqrt(v * v + i * i);
    }
}
