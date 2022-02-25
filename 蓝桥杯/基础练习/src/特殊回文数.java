import java.util.Scanner;

public class 特殊回文数 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arrProcess1(n);
        arrProcess2(n);
    }

    private static void arrProcess1(int n) {
        int arr[] = new int[5];
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if ((i * 2 + j * 2 + k) == n) {
                        arr[0] = i;
                        arr[1] = j;
                        arr[2] = k;
                        arr[3] = arr[1];
                        arr[4] = arr[0];
                        for (int l = 0; l < 5; l++) {
                            System.out.print(arr[l]);
                        }
                        System.out.print("\n");
                    } else {
                        continue;
                    }
                }
            }
        }

    }

    private static void arrProcess2(int n) {


        int arr[] = new int[6];
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if ((i * 2 + j * 2 + k * 2) == n) {
                        arr[0] = i;
                        arr[1] = j;
                        arr[2] = k;
                        arr[3] = k;
                        arr[4] = j;
                        arr[5] = i;
                        for (int l = 0; l < 6; l++) {
                            System.out.print(arr[l]);
                        }
                        System.out.print("\n");
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
