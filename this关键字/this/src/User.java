/**
 * "this"什么时候不能省略?
 *  用来区分局部变量和实例变量的时候不能省略
 */
public class User {

    private int id;//实例变量
    private String name;

    //构造函数
    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
