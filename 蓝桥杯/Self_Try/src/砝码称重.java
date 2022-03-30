import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class 砝码称重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        //可以去重
        HashSet<Integer> set = new HashSet<>();
        //创造列表,这样就可以遍历重量了
        List<Integer> list = null;
        set.add(sc.nextInt());
        for (int i = 0; i < length - 1; i++) {
            //每次存储重量
            int num = sc.nextInt();
            list = new ArrayList<>(set);
        for (Integer target : list) {


                set.add(num);
                set.add(Math.abs(num-target));
                set.add(num+target);
            }
        }
        System.out.println(set.size());
    }
}
