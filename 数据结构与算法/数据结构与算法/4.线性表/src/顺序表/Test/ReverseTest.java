package 顺序表.Test;

import 顺序表.Line.TowWayLinkList;

public class ReverseTest {

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
        System.out.println("----------------");
        sl.reverse();
        for (String s : sl) {
            System.out.println(s);
        }
    }

}





