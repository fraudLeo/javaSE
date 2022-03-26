package 顺序表.Line;

public class NodeD<T> {
    public T t;
    public NodeD pre;
    public NodeD next;
    public NodeD head;

    public NodeD(T t, NodeD pre, NodeD next) {
        this.t = t;
        this.pre = pre;
        this.next = next;
    }
}
