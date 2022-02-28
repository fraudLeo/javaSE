import java.util.Scanner;

public class 字母图形 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        drawAP(n,m);
    }

//    static int inPutNum() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        return n;
//    }

    static void drawAP(int n,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char s = (char) (Math.abs(j-i)+'A');
                System.out.print(s);
            }
            System.out.print("\n");
        }
    }
}
