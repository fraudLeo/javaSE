import java.util.Arrays;
import java.util.Scanner;

public class 无聊的逗 {
    public static void main(String[] args) {
        method1();
    }


    public static void method1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,0,arr.length);

        int len_choose = 0;
        for (int i = 0; i < N; i++) {
            sum+=arr[i];
        }

        double middle_num = sum/2.0;

        for (int i = N-1; i >=0; i--) {
            if (middle_num>=arr[i]+len_choose) {
                len_choose+=arr[i];
            }
        }

        System.out.println(len_choose);
    }
}
