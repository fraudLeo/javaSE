package src;

import java.util.Arrays;
import java.util.Scanner;

public class 礼物 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] arrs = new int[N];
        int[] choose = new int[999];
        int sum1 = 0;
        int sum2 = 0;
        int i1;
        int i2;
        int m = 0;
        for (int i = 0; i < N; i++) {
            arrs[i] = sc.nextInt();
        }

        for (int i = 1; i <=2/N; i++) {
            for (int j = 0; j <=N-i; j++) {

                for ( i1 = j; i1 <= j + i; i1++) {
                    sum1 +=arrs[i1];
                }
                for ( i2 = i1+j;i2<=j+i +i;i2++) {
                    sum2 +=arrs[i2];
                }
                if (sum2==sum1&&sum1<=S) {
                    choose[m] = 2*i;
                    m++;
                }

            }
        }


        int end = Arrays.stream(choose).max().getAsInt();
        System.out.println(end);
    }

}
