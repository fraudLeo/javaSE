package 十二届;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * 不明白为什么最后一问要减一
 */
public class 砝码称重 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        //输入第一个数
        //Hashset 可以去重
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(sc.nextInt());
        //建立list用来遍历
        List<Integer> list = null;

        for (int i = 0; i < length - 1; i++) {

            //接受剩下的砝码
            int num = sc.nextInt();

            //set集合转换为list集合
            list = new ArrayList<>(set);
            for (Integer target : list) {


                set.add(num);
                set.add(Math.abs(num-target));
                set.add((num+target));
            }
        }
        System.out.println(set);
        System.out.println(set.size());
    }

}
