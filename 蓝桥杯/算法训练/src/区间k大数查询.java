import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 第一行包含一个数n，表示序列长度。
 *
 * 第二行包含n个正整数，表示给定的序列。
 *
 * 第三个包含一个正整数m，表示询问个数。
 *
 * 接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
 */

public class 区间k大数查询 {


    public static void main(String[] args) {
        method1();
    }

    int x;
    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            arrs[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int x = 0;
        int l = 0,r = 0,k = 0;
        int[] storage = new int[1000];
        for (int i = 1; i <=m; i++) {

            for (int i1 = 0; i1 < 3; i1++) {
                l = sc.nextInt();
                r = sc.nextInt();
                k = sc.nextInt();
                storage[x] = solution(arrs,l,r,k);
                x++;
            }

        }
        for (int i = 0; i <= x; i++) {
            System.out.println(storage[i]);
        }
    }


    static int solution(int arrs[],int l,int r,int k) {


        int end = 0;

        int[] newArrs = new int[r-l+1];
        int cnt = 0;
        for (int i = l-1; i <= r-1; i++) {
           newArrs[cnt] = arrs[i];
            cnt++;
        }

        Arrays.sort(newArrs);

        StringBuilder sBuilder = new StringBuilder(Arrays.toString(newArrs));
        sBuilder.reverse();
        String str2 = sBuilder.toString();
        str2.toCharArray();


        end = newArrs[k-1];

        return end;
    }

}
