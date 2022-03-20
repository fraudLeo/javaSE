public class CustomerTest {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("张三");//当使用c1去访问该对象的时候,整个过程中出现的this就是c1

        Customer c2 = new Customer();
        c2.setName("李四");

        //静态方法已经分配内存了，而实例成员变量还没有分配内存
        c1.shopping1();
        Customer.shopping2();

    }
}
