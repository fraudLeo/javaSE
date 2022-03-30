public class test02 {
    public static void main(String[] args) {
        int s = 1;
        int k;


        for (int i = 2; i < 5; i++) {
            k = 1;
            int p = 0;
            for (int i1 = 1; i1 <=   i; i1++) {
                k*=i1;
            }
            System.out.println("相加之前:"+s+" ");
            s+=k;
            System.out.println("相加之后:"+s);
            System.out.println("---------");
        }
        System.out.println(s);
    }
}
