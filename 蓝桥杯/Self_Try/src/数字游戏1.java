
//理解不了qaq,太强了,写这个代码的人,特别是下面的vis[]这个数组不知道是干嘛的


import java.util.Scanner;


public class 数字游戏1 {
    static int sum;
    static int N;
    static int arr1[];
    static boolean bool = true;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        sum = input.nextInt();
        int array[] = new int[N];
        int visit[] = new int[N + 1];

        dfs(0, array, visit, bool);
    }

    public static void dfs(int step, int arr[], int vis[], Boolean b) {
        if (step == N) {
            int arr1[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr1[i] = arr[i];
            }
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < N - i; j++) {
                    arr1[j] = arr1[j] + arr1[j + 1];
                }
            }
            if (arr1[0] == sum) {
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                bool = false;
                return;

            } else
                return;
        }
        if (bool == true) {
            for (int i = 1; i <= N; i++) {
                if (vis[i] == 0) {
                    arr[step] = i;
                    vis[i] = 1;
                    dfs(step + 1, arr, vis, bool);
                    vis[i] = 0;
                }

            }
        }
        return;
    }
}
