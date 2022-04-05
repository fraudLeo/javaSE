package 顺序表.Test;

import 顺序表.Line.LinkList;
import 顺序表.Line.TowWayLinkList;

public class TwoWayLinkListTest {

    public static void main(String[] args) {

        //创建单项列表对象
        TowWayLinkList<String> sl = new TowWayLinkList<>();

        //测试插入
        sl.insert("姚明");
        sl.insert("kobe");
        sl.insert("James");
        sl.insert(1,"MG");
        for (String s : sl) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        System.out.println("第一个元素是:"+sl.getFirst());

        System.out.println("最后一个元素是"+sl.getLast());

        System.out.println("---------------");

        //测试获取
        int a = 1;
        String getResult = sl.get(a);
        System.out.printf("索引%d处的结果是%s\n",a,getResult);

        //测试删除
        int b = 0;
        String removeResult = sl.remove(b);
        System.out.printf("删除的元素是第%d个,元素值是%s\n",b,removeResult);

        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数是"+sl.length()+"个");


    }



}
