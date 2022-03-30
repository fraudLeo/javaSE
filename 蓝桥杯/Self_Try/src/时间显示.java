import java.util.Date;
import java.util.Scanner;

public class 时间显示 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        d.setTime(a-28800000);
        System.out.println(d);

        System.out.println(d.toString().substring(11, 20));
    }

}
