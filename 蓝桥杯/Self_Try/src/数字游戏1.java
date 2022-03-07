import java.util.Scanner;

import static java.lang.System.exit;

public class 数字游戏1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                arr[i1][i] = 0;
            }
        }

    }
}
