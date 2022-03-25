package 顺序表.Test;

import 顺序表.Line.SequenceList;

import java.util.Iterator;

public class SequenceListTest {

    public static void main(String[] args) {

        //创建数据表对象
        SequenceList<String> sl = new SequenceList<>(10);

        //测试插入
        sl.insert("姚明");
        sl.insert("kobe");
        sl.insert("James");
        sl.insert(1,"MG");
        for (String s : sl) {
            System.out.println(s);
        }
        System.out.println("---------------");

        //测试获取
        int a = 1;
        String getResult = sl.get(a);
        System.out.printf("索引%d处的结果是%s\n",a,getResult);

        //测试删除
        int b = 0;
        String removeResult = sl.remove(b);
        System.out.printf("删除的元素是第%d个,元素值是%s\n",b,sl.get(b));

        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素格式是"+sl.length()+"个");
    }



}
