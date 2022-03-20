public class Account {

    //账号
    private String acc;

    //余额
    private double balance;

    //无参数构造器
    public Account() {
        //在这里 他初始化实例变量的内存空间
//        acc = null;
//        balance = 0.0;
    }


    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
