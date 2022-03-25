package 顺序表.Test;

import 顺序表.Line.SequenceList;

public class SequenceListTest02 {
    public static void main(String[] args) {

        SequenceList sequenceList = new SequenceList(3);

        sequenceList.insert("张三");
        sequenceList.insert("李四");
        sequenceList.insert("王五");
        sequenceList.insert("赵六");//报索引异常


    }
}
