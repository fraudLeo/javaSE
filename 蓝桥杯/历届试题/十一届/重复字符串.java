package 十一届;

import java.lang.reflect.Array;
import java.util.*;

public class 重复字符串 {

    public static void main(String[] args) {

        //修改的次数
        int step = 0;

        Scanner sc = new Scanner(System.in);
        //输入的组的数量
        int K = sc.nextInt();
        //输入字符串
        String str = sc.next();

        //定义字母表 26个字母,以此来技术
        int alph[] = new int[26];
        //定长
        int str_length = str.length();
        //判断,如果str_length%K!=0 那么就是不满足条件 直接 -1
        if (str_length%K!=0) {
            System.out.println(-1);
        }
        int valay = str_length / K;
        //开始每列对齐,进行比较,并进行count
        String a = "-";
        String b = "=";
        for (int i = 0; i < valay; i++) {
            for (int i1 = i; i1 < str_length; i1+=valay) {
                alph[(int)(str.charAt(i1)-'a')]++;
//                System.out.println(a);
//                a+="-";
            }
//            System.out.println(b);
//            b+="=";
            //开始查询哪一个是最多的,将她们都转换掉
            int max = 0;
            for (int i1 = 0; i1 < 26; i1++) {
                if (alph[i1]>=max) {
                    max = alph[i1];
                }
            }

            step+=K-max;
            max = 0;
            Arrays.fill(alph,0);
        }

        System.out.println(step);
    }

}



 class desert01{

    void method01 (){
         Scanner sc = new Scanner(System.in);
         //输入的K 表示循环 K 次相同的字符组
         int K = sc.nextInt();

         //输入的字符串,要准备转换为字符数组,
         //首先要得出它的长度
         String str = sc.next();
         int length = str.length();
         char[] char_array = new char[length];
         //开始转化
         char_array = str.toCharArray();
         //需要辨别每种字符数量是否一样,否则输出-1
         HashSet<Object> set = new HashSet<>();
         for (int i = 0; i < length; i++) {
             set.add(char_array[i]);
         }

         //增加迭代器,以便读取每一个哈希set里面的值
         Iterator<Object> it = set.iterator();
         int[] eachCharNum = new int[set.size()];
         //计数cnt个字符串
         int cnt = 0;
         char[] exist = new char[set.size()];
         for (int i = 0; i < char_array.length; i++) {
             for (int j = 0; j < set.size(); j++) {
                 if (char_array==set.iterator().next()) {
                     exist[cnt++]++;
                     break;
                 }
             }
         }


     }

}

