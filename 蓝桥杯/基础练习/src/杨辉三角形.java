import java.util.Scanner;

public class 杨辉三角形 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        yanghui(n);
    }
    private static void yanghui(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }
        arr[0][0] = 1;
//        System.out.println(arr);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                arr[i][j] = arr[i-1][j-1] +arr[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 <=i; i1++) {
                System.out.print(arr[i][i1]+" ");
            }
            System.out.print("\n");
        }
    }
}
