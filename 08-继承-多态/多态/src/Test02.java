public class Test02 {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        int retValue = simInt(i,j);
    }

    private static int simInt(int i,int j) {
        int c = i+j;
        int b = 15;
        int res = devide(c,b);
        return res;
    }

    private static int devide(int c, int b) {
        int a = c/b;
        return a;
    }
}
