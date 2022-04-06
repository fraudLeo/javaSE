package 顺序表.Line;

import java.util.Iterator;

//为了外界更好的调用双向列表,我们这里可以调用Iterable接口
public class TowWayLinkList<T> implements Iterable<T>{
    //记录首节点
    private Node head;
    //记录尾节点
    private Node last;
    //记录链表长度
    private int N;



    //定义一个内部节点类
    public class Node<T> {
        public T item;
        public Node pre;
        public Node next;
        public Node(T item,Node pre,Node next) {
            this.item = item;
            this.next = next;
            this.pre = pre;
        }
    }

    public TowWayLinkList() {
        last = null;
        head = new Node(null,null,null);
        N= 0;
    }
    //空置线性表
    public void clear() {
        last = null;
        head.next = null;
        N = 0;//√
        head.pre = null;//√
        head.item = null;//√
    }
    //获取链表长度
    public int length() {
        return N;
    }
    //判断线性表是否为空
    public boolean isEmpty() {
        return N==0;
    }
    //获取线性表中的元素

    //读取并返回线性表中的第i 个元素
    public T get(int i) {
        if (isEmpty()) {
            return null;
        } else {
            Node n = head.next;
            for (int index = 0; index < i; index++) {
                n = n.next;
            }
            return (T) n.item;
        }
    }
    //往线性表中添加一个元素
    public void insert(T item) {
        if (isEmpty()) {
            Node newNode = new Node(item,head,null);
            last = newNode;
            head.next = last;
            N++;
        } else {
            Node oldlast = last;
            Node newNode = new Node(item,last,null);
            oldlast.next = newNode;
            last = newNode;
            N++;

        }
    }
    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T item) {
        //找到当前i位置前一个节点
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //找到i位置的节点
        Node currentI = pre.next;
        //创建新节点
        Node newNode = new Node(item, pre, currentI);
        //调整指向
//        currentI = newNode;
        currentI.pre = newNode;
        pre.next = newNode;
//        System.out.println(newNode.pre.item);
//        System.out.println(newNode.item);
//        System.out.println(newNode.next.item);
        //元素个数加一
        N++;
    }
    //删除并返回线性表中第i个元素
    public T remove(int i) {
        if (isEmpty()) {
            return null;
        } else if (i==N) {
            last.pre = last;
            N--;
            return (T) last.item;
        } else {
            //找到i位置的前一个结点
            Node pre = head;
            for (int index = 0; index < i; index++) {
                pre = pre.next;
            }

            //找到i位置的节点
            Node currentI = pre.next;
            //找到i位置后面的节点
            Node newI = currentI.next;
            //让i位置前的结点指向i位置后节点
            pre.next = newI;
            newI.pre = pre;
            //元素个数减一
            N--;
            //返回i位置的节点
            return (T) currentI.item;
        }

    }

    //返回线性表首次出现的指定的数据元素的位序号,若不存在,则返回-1/////////////////////这边可能有问题
    public int indexOf(T item) {
        Node n = head;
        for (int i = 0; n.next!=null; i++) {
            n = n.next;
            //很疑惑 为什么下面不用n.next.item
            if (n.item.equals(item)) {
                return i;
            }
        }

        return -1;
    }
    //获取第一个元素
    public T getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) head.next.item;
        }
    }
    //获取最后一个元素
    public T getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) last.item;
        }
    }


    //提供遍历方式
    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator {
        private Node n;
        public TIterator() {
            this.n = head;
        }
        @Override
        public boolean hasNext() {

            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }


    //用来反转整个链表
    public void reverse() {
        //判断当前链表是否为空链表,如果是,就结束运行,如果不是,则调用重载的reverse完成反转
        if (isEmpty()) {
            return ;
        }
        reverse(head.next);

    }

    //指定反转某个节点
    public Node reverse(Node curr) {
        //证明反转到最后一个节点
        if (curr.next==null) {
            head.next = curr;
            return curr;
        }
        //递归的反转节点curr的下一个几点;返回值就是链表反转后 当前节点的上一个节点
        Node pre = reverse(curr.next);
        //让返回的节点变成当前节点curr
        pre.next = curr;
        //把当前的节点的下一个节点变为null;
        curr.next = null;
        return curr;
    }
}
