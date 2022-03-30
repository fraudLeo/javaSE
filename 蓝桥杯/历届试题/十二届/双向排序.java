package 十二届;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 30 分,不想理解
 */
public class 双向排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数组长度
        int n = sc.nextInt();
        //操作次数
        int m = sc.nextInt();
        int[] arrs = new int[n];
        //初始化数组 1 2 3 4 5 6 ....n
        for (int i = 0; i < n; i++) {
            arrs[i] = i+1;
        }
        //读取操作
        int[][] operation_step = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                operation_step[i][j] = sc.nextInt();
            }

        }
            oper(arrs,operation_step,m);
        for (int i = 0; i < n; i++) {
            System.out.print(arrs[i]+" ");
        }

    }

    private static void oper(int[] arrs, int[][] operation_step,int m) {


        //遍历每一步操作
        for (int i = 0; i < m; i++) {
            //判断第一个数字 以此来选择模式
            //这里是正序排序
            if (operation_step[i][0] == 0) {
                //倒叙方法
                arrs = flashback(arrs,operation_step[i][1]);

            } else {
                Arrays.sort(arrs,operation_step[i][1]-1,arrs.length);
            }

        }

    }


    private static int[] flashback(int[] arrs, int i) {
        //先正序排列好,再倒过来


        for (int j = i; j >0; j--) {
            for (int k = 0; k < j-1 ; k++) {
                if (arrs[k]<arrs[k+1]) {
                    int temp = arrs[k];
                    arrs[k] = arrs[k+1];
                    arrs[k+1] = temp;
                }
            }
        }
        return arrs;
    }

}
