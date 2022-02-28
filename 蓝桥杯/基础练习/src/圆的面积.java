//100
import java.util.Scanner;

public class 圆的面积 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double s = 0;
        double PI = Math.atan(1.0)*4;
//        System.out.println(PI);
        s = PI*Math.pow(r,2);
//        long temp = (long) (s*Math.pow(10,8));


//        if (temp%10>=5) {
//            temp +=10;
//        } else {
//            temp = temp;
//        }
//
//        System.out.println(temp);
//        double end = temp/10;
//        System.out.println(end);
        System.out.println(String.format("%.7f",s));

    }
}
