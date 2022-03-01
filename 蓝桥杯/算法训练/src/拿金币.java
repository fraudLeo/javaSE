import java.util.Scanner;

//动态规划
//分数：?????100---70--60??
//同一个代码，不同分数
public class 拿金币 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                arr[i1][i] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i==0&&i1>0) { //判断上边界
                    arr[i1][i]+= arr[i1-1][i];
                } else if (i1==0&&i>0) {//判断左边界
                    arr[i1][i] += arr[i1][i];
                } else if (i>0) {//求内部
                    arr[i1][i]+= Math.max(arr[i1-1][i],arr[i1][i-1]);
                }
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
//public class 拿金币2 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
////        m = sc.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int i1 = 0; i1 < n; i1++) {
//                arr[i1][i] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int i1 = 0; i1 < n; i1++) {
//                if (i==0&&i1>0) {//上边界
//                    arr[i1][i] += arr[i1-1][i];
//                } else if (i1==0&&i>0) {//左边界
//                    arr[i1][i]+= arr[i1][i-1];
//                } else if (i>0) {
//                    arr[i1][i] += Math.max(arr[i1-1][i],arr[i1][i-1]);
//                }
//            }
//        }
//        System.out.println(arr[n-1][n-1]);
//    }
//
//}
