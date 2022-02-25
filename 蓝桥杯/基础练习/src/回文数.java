import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
//        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];

        for (int i = 1; i <=9; i++) {
            for (int j = 0; j <=9 ; j++) {
                arr[0] = i;
                arr[1] = j;
                arr[2] = j;
                arr[3] = i;
                for (int k = 0; k < 4; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println("");
            }
        }

    }
}
