public class ChinesseTest {
    public static void main(String[] args) {

        //创建中国人对象1
        Chinese c1 = new Chinese("1","张三");
        System.out.println(c1.id+","+c1.name + "," + Chinese.country);

        //创建中国人对象2
        Chinese c2 = new Chinese("2","李四");
        System.out.println(c2.id+","+c2.name+","+Chinese.country);

        System.out.println(Chinese.country);
        System.out.println(c1.country);
        c1 = null;
        //所有的静态数据都是可以采用类名,也可以采用引用,但是建议采用类名.的方式访问.
        //采用 引用. 的方式访问的时候,即使引用是null,也不会出现空指针异常,因为将访问静态的数据不需要对象的存在
        System.out.println(c1.country);

    }
}
