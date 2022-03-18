package Object;

// 用户类
public class User {
    public int age;
    private int tel;

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        //因为遵循就近原则 所以 第一份tel要加this 标识苯类的成员变量
        this.tel = tel;
    }
}
