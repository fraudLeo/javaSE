package 顺序表.Line;

public class Node<T> {

    //存储元素
    public T item;
    public Node next;
    public Node pre;

    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }
}
