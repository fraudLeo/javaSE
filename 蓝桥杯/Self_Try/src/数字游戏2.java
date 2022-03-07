// 数字游戏
import java.util.Arrays;
import java.util.Scanner;

public class 数字游戏2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int array[] = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = i+1;
        }



        do {
            int temp[] = new int[n];
            System.arraycopy(array, 0, temp, 0, array.length);
            // 计算每次生成的排列的最后得到的数字
            for(int i=0; i<temp.length-1; i++) {
                for(int j=0; j<temp.length-i-1; j++) {
                    temp[j] = temp[j] + temp[j+1];
                }
            }
            //最后只有temp[0]
            // 如果最后得到的数字等于sum，则输出结果
            if (temp[0] == sum) {
                for (int i=0; i<array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                break;
            }

        } while(next_permutation(array));

        scanner.close();
    }
    public static boolean next_permutation(int[] array) {
        if(array.length <= 1) {
            return false;
        }

        int i = array.length-2;//取倒数第二位
        // 寻找第一个不满足降序的数
        while (i>=0 && array[i]>array[i+1]) {
            i--;
        }
        if (i == -1) {
            return false;
        }

        // 寻找大于 array[i] 的最小的数，作交换
        int j = i + 1;
        while (j<array.length && array[j]>array[i]) {
            j++;
        }
        swap(array, i, j-1);
        // 对 i 后的数排序
        Arrays.sort(array, i+1, array.length);

        return true;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
