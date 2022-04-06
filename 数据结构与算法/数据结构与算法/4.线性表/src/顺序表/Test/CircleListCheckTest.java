package 顺序表.Test;

public class CircleListCheckTest {
    public static void main(String[] args) {

        //创建节点
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> sixth = new Node<String>("ff", null);
        Node<String> seventh = new Node<String>("gg", null);
//        Node<String> eigth = new Node<String>("hh",null);
        //完成结点间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
//        seventh.next = eigth;
        //产生一个环
        seventh.next = third;

        //判断链表是否有环
        boolean circle = isCircle(first);
        System.out.println("first链表中有环" + circle);
    }

    private static boolean isCircle(Node<String> first) {

        //定义快慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        //遍历链表,如果快慢指针指向同一节点.则证明有环
        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast.item.equals(slow.item)) {
                return true;
            }
        }
        return false;
    }

    //节点类
    private static class Node<T> {
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
