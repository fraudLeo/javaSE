package 顺序表.Test;

public class FastSlowTest {
    public static void main(String[] args) {

        //创建节点
        Node<String> first = new Node<String>("aa",null);
        Node<String> second = new Node<String>("bb",null);
        Node<String> third = new Node<String>("cc",null);
        Node<String> fourth = new Node<String>("dd",null);
        Node<String> fifth = new Node<String>("ee",null);
        Node<String> sixth = new Node<String>("ff",null);
        Node<String> seventh = new Node<String>("gg",null);
        Node<String> eigth = new Node<String>("hh",null);
        //完成结点间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
//        seventh.next = eigth;


        //查找中间值
        String mid = getMid(first);
        System.out.println("中间值为"+mid);
    }

    public static String getMid(Node<String> first) {
        //定义两个指针
        Node<String> fast = first;
        Node<String> slow = first;
        //使用两个指针来进行遍历链表,当快指针只想节点的时候没有下一个节点,就可以结束了,结束之后
        //慢指针只想的节点就是中间值
        while(fast!=null&&fast.next!=null) {
            //变化fast的值和slow
            fast = fast.next.next;
            slow = slow.next;
        }
        return (String) slow.item;
    }

    //节点类
    static class Node<T> {
        //存储数据
        T item;
        //下一个节点
        Node next;
        public Node (T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }


}
