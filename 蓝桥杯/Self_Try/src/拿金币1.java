import java.util.Scanner;

public class 拿金币1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine(); //去除回车的影响
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str [] = s.nextLine().trim().split(" ");//把输入的字符串去掉首尾的空格后以" "为条件分割成一个String数组。
            for (int j = 0; j < n; j++) {
                arr[i][j]=Integer.parseInt(str[j]);//将字符数组中的元素变为数字
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int left = j-1 < 0 ? 0 : arr[i][j-1];//判断是否为最左面
                int up = i-1 < 0 ? 0 : arr[i-1][j];//判断是否为最上面
                arr[i][j] = Math.max(left,up) + arr[i][j];//取最左面和最上面其中金币数目最大的加上当前格子的初始金币数量
            }
        }
        System.out.println(arr[n-1][n-1]); //for循环从0开始，所以是n-1
    }
}

