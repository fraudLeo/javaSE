import java.util.Scanner;

public class 无聊的逗 {

    static int n;
    static int[] nums;

    /**
     * 最长的相同木棍长度
     */
    static int maxLength = Integer.MIN_VALUE;

    /**
     * 存储某种排列组合下木棍的长度
     */
    static int[] length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        nums = new int[n];

        //对于n个木棍，共有2^（n-1）种排列组合方式,但是0不能进行进位操作，所以要多留出一位用来进位
        length = new int[1<<n];

        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();

            //1<<i表示的下标指的是只选第i根木棍的长度
            length[1<<i] = nums[i];
        }

        //遍历存储每一种选择方式的长度，i=1的情况
        for(int i = 0;i < ( 1 << n ); i++){

            //这一层遍历是用来选择木棍的
            for(int j = 0;j < n;j++){

                //如果i这种情况和选择木棍j有冲突，也就是第i种选择方式并没有选择第j跟木棍
                //举个例子，比如i为4，二进制就是100，但是j为0，也就是选择了第1根木棍
                //此时 1<<j = 001  那么第i种情况明显没有选择木棍j，所以他们进行按位与运算的结果就是0
                //因此这种情况出现冲突，不用进行运算
                if((i & (1<<j) ) == 0){
                    continue;
                }

                //如果这种情况考虑在内了，那么第i种情况的长度就是木棍j的长度加上情况i不选择木棍j的长度
                //还是举个例子
                //比如目前i是5，也就是101,j是2,也就是第三根木棍,此时1<<j = 100,
                //那么第i种组合的情况其实就是i = 001 时的长度加上木棍j的长度
                length[i] = length[i - (1<<j)] + nums[j];

                //这个break是用来防止重复计算的
                break;
            }
        }

        //枚举每一种情况i
        for(int i=0;i< (1 << n);i++){
            //j就是选出了所有情况i没有选择的木棍的情况，(1<<n) -1指的是选择了所有木棍的一种情况
            //1<<n 就是第n+1位为1，其余每一位为0，比如n=5时，表示100000，
            //1<<n - 1 就是从1到第n位每一位都为1，比如n=5时，表示的就是11111;
            //(1<<n) - 1 -i 就是选择了所有i没有选择的木棍的情况，比如n=5,i=3
            //那么(1<<n)-1 = 11111，i=00011,那么(1<<n) - 1 -i = 11100
            int j = (1 << n) -1 -i;

            //接下来的循环是尝试从选择了全部i没选的木棍的情况开始枚举
            //枚举每一种可能的选择情况，k--会存在不合理的数据，比如说现在剩下的木棍是11000，而k当前枚举到的实是10000,
            //那么此时k-- = 01111，后面会多出三个木棍，所以我们需要使用按位与来去除多余的木棍，
            for(int k = j;k > 0;k = (k-1)&j){
                if(length[k] == length[i]){
                    maxLength = Math.max(maxLength,length[k]);
                }
            }
        }
        System.out.println(maxLength);

    }
}


