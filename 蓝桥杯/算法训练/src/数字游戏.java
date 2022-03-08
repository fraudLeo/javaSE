//搜索
import java.util.Arrays;
import java.util.Scanner;

/**
 * 直接通过全排列暴力搜索，由于Java中没有提供全排列函数 next_permutation，所以要自己实现。注意实现全排列的时候的每个排列之间要满足升序，从而贪心的达到结果的字典序最小。
 */

/*
* System.arraycopy():
* public static native void arraycopy(Object src,  int srcPos, Object dest, int destPos, int length);
*
* Object src：the source array. 源数组
int srcPos：starting position in the source array. 在源数组中，开始复制的位置
Object dest：the destination array. 目标数组
int destPos：starting position in the destination data. 在目标数组中，开始赋值的位置
int length：the number of array elements to be copied. 被复制的数组元素的数量

 * */
public class 数字游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = sc.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        do {
            int temp[] = new int[N];
            System.arraycopy(arr,0,temp,0,arr.length);
            for (int i = 0; i < arr.length-1; i++) {
                for (int i1 = 0; i1 < arr.length - i - 1; i1++) {
                    temp[i1] +=temp[i1+1];
                }
            }
            if (temp[0] ==sum) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            }

        } while (next_permutation(arr));
    }


    public static boolean next_permutation(int arr[]) {
        if (arr.length<=1) {
            return false;
        }
        int i = arr.length-2;
        while (i>=0 && arr[i]>arr[i+1]) {
            i--;
        }
        if (i==-1) {
            return false;
        }
        int j = i+1;
        while (j<arr.length&&arr[j]>arr[i]) {
            j++;
        }
        swap(arr,i,j-1);
        Arrays.sort(arr,i+1,arr.length);

        return true;
    }

    public static void swap(int arr[],int i,int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
