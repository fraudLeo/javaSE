public class testArrs {
    public static void main(String[] args) {

        int x = 5;
        int y = 30;
        int[][] arr = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {//整行走过来
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
//i对应的是有多少行
//y对应的是有多少列