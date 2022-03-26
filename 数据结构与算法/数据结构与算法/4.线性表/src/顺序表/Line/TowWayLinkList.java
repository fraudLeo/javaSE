package 顺序表.Line;

public class TowWayLinkList<T> {

    private NodeD first;
    private NodeD last;
    private int N;
    private NodeD head;

    public TowWayLinkList() {
        this.head = new NodeD(null,null,null);
        this.last = null;
        this.N = 0;

    }

    public void clear() {
        N = 0;
        head.next = null;
        head.pre = null;
        last.pre = null;
    }

    public boolean isEmpty() {
        return N==0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        NodeD n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return (T) n.t;
    }

    public void insert(T t) {
        NodeD newNode;
//        如果链表为空则创建新的节点
        if ( isEmpty()) {
            newNode = new NodeD(t, head, null);
        }

//        last = newNode;
//
//    public void insert(int i,T t) {
//
//    }
//
//    public T remove(int i)  {
//
//    }
//
//    public int indexOf(T t) {
//
//    }
//
//    public T getFirst() {
//        if (isEmpty()){
//            return null;
//        } else {
//            return (T) head.t;
//        }
//
//    }
//
//    public T getLast() {
//        if (isEmpty()){
//            return null;
//            } else {
//            return (T) last.t;
//            }
//
//        }
//    }

}
