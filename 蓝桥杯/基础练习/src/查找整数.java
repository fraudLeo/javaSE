//////////////////////////////////////
import java.util.Scanner;

public class 查找整数 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int n = inPutNum();
//        int arr[] = new int[n];
        int arr[] = inPutArr(new int[n],n);

        int m = inPutNum();
        for (int i = 0; i < n; i++) {
            if (m==arr[i]) {
                System.out.println(i+1);
                break;
            } else {
                System.out.println("-1");
            }
        }

    }
    private static int inPutNum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    private static int[] inPutArr(int arr[],int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
