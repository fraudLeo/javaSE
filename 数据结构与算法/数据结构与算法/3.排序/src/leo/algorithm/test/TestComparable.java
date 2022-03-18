package leo.algorithm.test;

import leo.algorithm.sort.Student;

public class TestComparable {
    public static void main(String[] args) {
        //创建两个Student对象,并且调用 getMax方法
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setUsername("张三");
        s2.setUsername("里斯");

        s1.setAge(11);
        s2.setAge(100);
        Comparable max = getMax(s1, s2);

        System.out.println(max);
    }


    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);//内部执行了  "c2 - c1"
//        System.out.println(c1+" "+c2+" "+ result);
        //如果 result < 0 则c1 < c2
        //如果 result > 0 则c1 > c2
        //如果 result == 0 则c1==c2
        if (result>=0) {
            return c1;
        } else {
            return c2;
        }
    }
}
