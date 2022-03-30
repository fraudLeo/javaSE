package 十二届;

import java.util.Scanner;

/**
 * 对的,但是错误,不知道为啥
 */
public class 杨辉三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inP = sc.nextInt();
        int[][] tran = new int[inP][inP];


        //让最左列都是0
        for (int i = 0; i < inP; i++) {
            tran[i][0] = 1;
        }

        //创造杨辉三角形
        for (int i = 1; i < inP; i++) {//行数
            for (int j = 1; j <=i ; j++) {//列数
                tran[i][j] = tran[i-1][j-1]+tran[i-1][j];
            }
        }
        int cnt = 0;
        for (int i = 0; i < inP; i++) {
            for (int j = 0; j <=i ; j++) {
                cnt++;
                if (tran[i][j]==inP) {
                    System.out.println(cnt);
                    return;
                }
            }
        }

    }
}
