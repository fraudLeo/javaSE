package 十二届;

import java.util.Scanner;

/**
 * 网上的100分,理解
 */
public class 杨辉三角形2 {
    public static void main(String[] args) {
        //输入数据
        Scanner sc = new Scanner(System.in);
        long inP = sc.nextLong();

        long arr[] = new long[99999];
        arr[0] =1;
        if (inP==1) {
            System.out.println(1);
            return;
        }
    long cnt = 1L;//long是因为要用最长的,不然娶不到, 用1 是因为下面吞了一次
        for (int i = 1; i < 40000; i++) {
            for (int j = i; j >= 1; j--) {
                arr[j] += arr[j-1];
                if (arr[j]==inP) {
                    System.out.println(cnt+i-j+1);//前一个外循环里面的cnt 加上这次的总数减去已求数,就是当前位置的前一个点,所以得加一
                    return;
                }
            }
            cnt += (i+1);//每次内循环结束了之后,都会多i+1次,比如第二行第二个就是3     1+2

        }
    }
}
