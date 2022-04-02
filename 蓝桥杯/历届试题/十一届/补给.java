package 十一届;
/*
4 10
1 1
5 5
1 5
5 1
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 补给 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //村庄数量
        int n = sc.nextInt();
        //飞行距离
        int D = sc.nextInt();
        //输入村庄坐标
        //先定好数组
        int[][] location = new int[n][2];
        //将坐标输入进去
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                location[i][j] = sc.nextInt();
            }
        }
        //开始计算两点之间的距离
        double distance[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                //i to j 's distence equals j to i;
                distance[i][j] = distance[j][i] = distanceOperation(location,i,j);
                //去掉不满足条件的距离
                if (distance[i][j]>D) {
                    distance[i][j] = 1e9;
                }
            }
            
        }
        //有思路,就是在每个距离后面加个状态,true false,当其他地点全部变为false的时候,0变为true,
        boolean flag[] = new boolean[n];
        Arrays.fill(flag,true);
        flag[0] =  false;
        double sumDistance = 1e9;
//        double sumDistance_after = 1e9;
        int outFlag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n; j++) {
                if (flag[j]) {
                    sumDistance += Math.min(sumDistance,distance[i][j]);
                    outFlag = j;
                    //这边不应该直接false,因为不确定有没有采用
                    //妈的,就这边错了,找不到解决思路..想的使用 二维数组,表示两种状态,当都为同一种的时候,才是真真的false
                    //就不写了,傻逼题目
//                    flag[j] = false;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111

                }
            }
        }
        sumDistance +=distance[outFlag][0];
        System.out.println(sumDistance);
    }

    //计算距离方法
    private static double distanceOperation(int[][] location, int i, int j) {

        int x = location[i][0]-location[j][0];
        int y = location[i][1]-location[j][1];

        return Math.sqrt(x*x+y*y);
    }

}
class desert {
    void desert01() {
//        Scanner sc = new Scanner(System.in);
//        //村庄数量
//        int n = sc.nextInt();
//        //飞行距离
//        int D = sc.nextInt();
//        //输入村庄坐标
//        //先定好数组
//        int[][] location = new int[n][2];
//        //将坐标输入进去
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 2; j++) {
//                location[i][j] = sc.nextInt();
//            }
//        }
//        //计算两点之间的距离
//        //得先定义一个储存数据的数组,String类型,为了小数,然后删选处大于D的数据,还有地点
//        String distance[][] = new String[999][2];
//        //初始村庄
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1;j<n;j++) {
//                //(x^2+y^2).sqtr
//                distance[cnt][0] = String.valueOf(Math.sqrt(((location[i][0]-location[j][0])*(location[i][0]-location[j][0]))+
//                        ((location[i][1]-location[j][1])*(location[i][1]-location[j][1]))));
//                //赋值给数组,表示位移关系
//                //顺便挑出不符合条件的数据
//                if (Double.parseDouble(distance[cnt][0])>D) {
//                    distance[cnt][1] = String.valueOf(1e9);
//                } else {
//                    distance[cnt][1] = "place: "+i+" to "+"place: "+j+";";
//                }
//            }
//        }
//        //正式开始进行路程的规划
//        //动态的移动指针
//        int i = 0;
//
//        while(distance[i][0]==null) {
//            if (distance[i][0].equals(String.valueOf(1e9))) {
//
//            }
//            i++;
//        }
    }

}
