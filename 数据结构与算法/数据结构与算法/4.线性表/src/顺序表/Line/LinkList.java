package 顺序表.Line;

import java.util.Iterator;

public class LinkList<T> implements  Iterable<T>{
    //记录头节点
    private Node head;

    //记录链表的长度
    private int N;

    //节点类有了
    //public class Node
    public LinkList() {

        //初始化头节点
        this.head = new Node(null,null);
        //初始化元素个数
        this.N = 0;
    }

    //空置线性表
    public void clear() {
        head.next = null;
        this.N = 0;
    }

    //判断线性表是否为空
    public boolean isEmpty() {
        return N==0;
    }

    //获取线性表中的元素
    public int length() {
        return N;
    }

    //读取并返回线性表中第i个
    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return (T) n.item;
    }

    //往线性表中添加一个元素
    public void insert(T t) {

        //找到最后一个节点
        Node n = head;
        while(n.next!=null) {
            n = n.next;
        }
        //创建新节点,保存元素t
        Node newNode = new Node(t, null);

        //让当前最后一个节点指向新节点
        n.next = newNode;
        //元素的个数+1
        N++;

    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t) {

        //找到i位置前的一个节点啊
        Node pre = head;
        for (int index = 0;index<=i-1;index++) {
            pre = pre.next;
        }

        //找到i位置的节点
        Node curr = pre.next;

        //创建新节点,并且新节点需要只想原来i位置的节点
        Node newNode = new Node(t, curr);;

        //原来位置的前一个结点指向新节点即可
        pre.next = newNode;

        //元素的个数+1
        N++;
    }

    //删除并返回线性表中的第i个元素
    public T remove(int i) {
        //找到i位置的前一个结点
        Node pre = head;
        for (int index = 0; index < i-1; index++) {
            pre = pre.next;
        }
        //要找到i位置的节点
        Node curr = pre.next;
        //要找i位置下一个节点
        Node nextNode = curr.next;
        //让前一个结点指向下一个节点
        pre.next = nextNode;
        //元素个数减一
        N--;
        return (T) curr.item;
    }

    //查找元素t爱链表中第一次出现的位置
    public int indexOf(T t) {
        //从头结点开始,一次寻找一次寻找每一个节点,取出item 和t比较,如果找到了,就找到了
        Node n = head;
        for (int i = 0; n.next!=null; i++) {
            n =n.next;
            if (n.item.equals(t)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
        private Node n;
        public LIterator() {
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
}
