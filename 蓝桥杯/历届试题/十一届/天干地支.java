package 十一届;

import java.util.Scanner;

public class 天干地支 {

    static final String[] tiangan = { "jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren", "gui"};
    static final String [] dizhi = { "zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu", "hai" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year_input = sc.nextInt();

        System.out.print(tiangan[(year_input+6)%10]);
        System.out.print(dizhi[(year_input+8)%12]);
    }
}
