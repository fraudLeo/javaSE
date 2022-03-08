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
            array[i] = i+1;//array = {1,2,3,4}
        }



        do {
            int temp[] = new int[n];//每轮都会重新定义
            System.arraycopy(array, 0, temp, 0, array.length);//将array里面的 值 都复制给temp
            // 计算每次生成的排列的最后得到的数字
            for(int i=0; i<temp.length-1; i++) {
                for(int j=0; j<temp.length-i-1; j++) {
                    temp[j] = temp[j] + temp[j+1];
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            //最后只有temp[0]
            // 如果最后得到的数字等于sum，则输出结果
            System.out.println("============");
            if (temp[0] == sum) {
                for (int i=0; i<array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                break;
            }

        } while(next_permutation(array));//false的时候结束

        scanner.close();
    }
    //上面的都理解



    public static boolean next_permutation(int[] array) {//自定义方法,c语言里面的,表示下一种排列方式

        if(array.length <= 1) {//排除长度为0,1的那种不规则数组
            return false;
        }

        int i = array.length-2;//取倒数第二位.   因为下面是有一个i+1 所以最高位要从倒二开始

        // 寻找第一个不满足降序的数
        while (i>=0 && array[i]>array[i+1]) {
            i--;//这里面的i值回传到外面
        }
        if (i == -1) {
            return false;//返回false直接结束循环
        }

        // 寻找大于 array[i] 的最小的数，作交换
        int j = i + 1;
        while (j<array.length && array[j]>array[i]) {
            j++;
        }
        swap(array, i, j-1);
        // 对 i 后的数排序
        Arrays.sort(array, i+1, array.length);//第三个参数取不到

        /**
         * Arrays.sort()重载了四类方法
         * sort(T[] a)：对指定T型数组按数字升序排序。
         * sort(T[] a,int formIndex, int toIndex)：对指定T型数组的指定范围按数字  " 升序 "  排序。
         * sort(T[] a, Comparator<? supre T> c): 根据指定比较器产生的顺序对指定对象数组进行排序。
         * sort(T[] a, int formIndex, int toIndex, Comparator<? supre T> c): 根据指定比较器产生的顺序对指定对象数组的指定对象数组进行排序。
         */

        return true;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
