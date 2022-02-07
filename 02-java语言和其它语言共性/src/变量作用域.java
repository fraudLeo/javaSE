public class 变量作用域 {
    //这个可以作用于整个类
    static int k = 1;

    public static void main(String[] args) {

        int numInMain = 99;
        System.out.println(k);//可行


        变量作用域 testName = new 变量作用域();
        testName.AreaTest();


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);//这里会报错
        //因为执行完for循环之后,i的内存会被释放
    }
   public void AreaTest(){
        int a = 8;
//       System.out.println(numInMain);//这个是行不通的
       System.out.println(k);
   }
}
