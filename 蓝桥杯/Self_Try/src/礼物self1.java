import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 礼物self1 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] arrs = new int[N];
        int[] choose = new int[999];

        int i1;
        int i2;
        int m = 0;
        for (int i = 0; i < N; i++) {
            arrs[i] = sc.nextInt();
        }

        for (int i = 1; i <=N/2; i++) {//每次列表里的数据是多少个
            for (int j = 0; j <N-(2*i); j++) {//从第几个开始
                int sum1 = 0;
                int sum2 = 0;
                System.out.println("---------开始-----------");
                System.out.print("开始第一组数列:  ");
                for ( i1 = j; i1 <= j + i - 1; i1++) {
                    sum1 +=arrs[i1];
                    System.out.print(arrs[i1]+ " ");
                }
                System.out.println("这是sum1:  "+ sum1);
                System.out.println(" ");
                System.out.print("开始第二组数列:  ");
                for ( i2 = j+i; i2 <=j+i+i-1; i2++) {
                    sum2 +=arrs[i2];
                    System.out.print(arrs[i2]+ " ");
                }
                System.out.println("这是sum2:  "+ sum2);
                System.out.println(" ");
                if (sum2==sum1&&sum1<=S) {
                    choose[m] = 2*i;
                    m++;
                }
            }
        }

        System.out.println(Arrays.toString(choose));
        int end = Arrays.stream(choose).max().getAsInt();
        System.out.println(end);
    }

}