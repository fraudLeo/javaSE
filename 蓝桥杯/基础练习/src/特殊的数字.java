public class 特殊的数字 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {

        int arr[] = new int[3];
        for (int i = 1; i <=9; i++) {
            for (int j = 0; j <=10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[0] = i;
                    arr[1] = j;
                    arr[2] = k;
                    int num = i*100+j*10+k;
                    if(num == Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)) {
                        for (int l = 0; l < 3; l++) {
                            System.out.print(arr[l]);

                        }
                        System.out.println("");
                    }
                }

            }

        }
    }



}

