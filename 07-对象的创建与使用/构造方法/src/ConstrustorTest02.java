/*
    构造方法的作用:
        1. 创建对象
        2. 创建对象的同时 初始化实例变量的内存空间


    最终结论:
        方法调用的时候涉及到参数传递的问题,传递的时候.java之遵循一种
        语法机制,就只将变量中保存的值传递过去了只不过有的时候这个值是
        一个字面值,有的时候是另一个java对象 的 内存地址

 */
public class ConstrustorTest02 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAcc("asd");
        account.setBalance(100.1);
        System.out.println(account.getAcc());
        System.out.println(account.getBalance());
    }

}



