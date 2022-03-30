package 十二届;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * api 100
 */
public class 时间显示 {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        long inPut_time = scanner.nextLong();
        //如果出来就是21:00,如果不改的话,因为初始时间是8:00,对于格林威治时间,这里的8:00是那里的00:00
        date.setTime(inPut_time-8*60*60*1000);
        System.out.println(date.toString().substring(11,19));

    }
}
