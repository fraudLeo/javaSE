////////////////////////////////////////////
import java.util.Scanner;

public class 数列特征 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        int n = inPutNum();
        int arr[] = inPutArr(new int[n],n);
        maxNum(arr,n);
        minNum(arr,n);
        sumNum(arr,n);
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

    private static void maxNum(int arr[],int n) {
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (temp<arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }


    private static void minNum(int arr[],int n) {
        int temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (temp>arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);

    }


    private static void sumNum(int arr[],int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
