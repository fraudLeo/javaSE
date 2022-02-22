import java.util.Scanner;

public class 数列排序 {
    public static void main(String[] args) {
        数列排序.方法();

    }
    static void 方法() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//长度为n
        int i = 0;
        int[] arr = new int[n];

        while(i<n) {
            arr[i] = sc.nextInt();
            i++;
        }

        for (int j = 0; j < n-1; j++) {
            int temp = 0;
            for (int k = j+1; k < n ; k++) {
                if (arr[k] < arr[j]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
            if (j!=n-1) {
                System.out.print(" ");
            }
        }
    }//正常写法,比较冗长

}
