package 十一届;

import java.util.ArrayList;
import java.util.Scanner;

public class 蓝肽子序列 {


    /**
     * 测试数据
LanQiaoBei
LanTaiXiaoQiao
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入两个
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
//        ArrayList<Object> objects = new ArrayList<>();

        //需要将字符串转化为数组
        //首先确定了是固定两行的二维数组
        //String[][] first_arr = new String[2][first_cnt];
        //String[][] second_arr = new String[2][second_cnt];
        //那么就得确切计数first_cnt了,同理second
        int first_cnt = 0;
        for (int i = 0; i < firstLine.length(); i++) {
            if(firstLine.charAt(i)<97) {
                first_cnt++;
            }
        }
        int second_cnt = 0;
        for (int i = 0; i < secondLine.length(); i++) {
            if(secondLine.charAt(i)<97) {
                second_cnt++;
            }
        }
        //这里已经确定好了没个二维数组的长度了
        String[] first_arr = new String [first_cnt];
        String[] second_arr = new String [second_cnt];

        //开始给数组赋值
        //本来可以用方法的,脑子没转过来.反复写了两次
        int first_temp_cnt = -1;
        for (int i = 0; i < firstLine.length(); i++) {
            //当字符是大写时,就会开启新的元素,否则就接着
            if (firstLine.charAt(i)<97) {
                //这里不会将每个字符值到数组里面
                first_arr[++first_temp_cnt] = String.valueOf(firstLine.charAt(i));
            } else {
                first_arr[first_temp_cnt] += String.valueOf(firstLine.charAt(i));
            }
        }
        //这里能输出,说明上面得赋值没有问题
//        test01(first_arr);

        int second_temp_cnt = -1;
        for (int i = 0; i < secondLine.length(); i++) {
            if (secondLine.charAt(i)<97) {
                //这里不会将每个字符值到数组里面
                second_arr[++second_temp_cnt] = String.valueOf(secondLine.charAt(i));
            } else {
                second_arr[second_temp_cnt] += String.valueOf(secondLine.charAt(i));
            }
        }
        //这里也没有问题
//        test01(second_arr);

        //开始遍历两个数组,一旦相同就输出成一个新的数组
//        String[] end = new String[Math.max(first_cnt,second_cnt)!=first_cnt?first_cnt:second_cnt];

        int end_cnt = 0;
        for (int i = 0; i < first_cnt; i++) {
            for (int i1 = 0; i1 <= second_temp_cnt; i1++) {
                if (first_arr!=null&&first_arr[i].equals(second_arr[i1])) {
//                    end[end_cnt] = first_arr[i];//但是就是不走下来
//                    System.out.println(end_cnt);
                    end_cnt++;
                    break;
                }
            }
        }
        System.out.println(end_cnt);

    }




    private static void test01(String[] first_arr) {

    }





}
