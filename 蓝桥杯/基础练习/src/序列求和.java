//100
import java.util.Scanner;

public class 序列求和 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
