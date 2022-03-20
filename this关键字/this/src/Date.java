/**
 * 自定义日期类型:
 *
 * this 可以使用在哪里:
 *      1. 可以使用在实例方法当中,代表对象 语法格式:[this.变量]
 *      2. 可以使用在构造方法当中,通过当前的构造方法调用其他的构造方法. 语法格式:[this()]
 *      3. 重点: this() 这种语法只能出现在构造方法第一行
 */
public class Date {

    private int year;
    private int month;
    private int day;
    String str;

    public Date() {
//        this.year = 1970;
//        this.month = 1;
//        this.day = 1;
        //以上方法可以调用有参构造
        //但是不可以创建新的对象,以下代码表示创建了一个全新的对象
//        new Date(1970, 1, 1);
        //需要采用以下的方法来进行调用:
        //这种方式不会创建新的java对象,但是又同时可以达成调用其他构造方法
        this(1970,1,1);
    }

    public Date(int year, int month, int day) {
        this.year = 1970;
        this.month = 1;
        this.day = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        String str = "\""+this.year+"-" +this.month + "-" + this.day + "\"";
        this.str = str;
        return  str;
    }
    public void print() {
        System.out.println("\""+this.year+"-" +this.month + "-" + this.day + "\"");
    }
}
