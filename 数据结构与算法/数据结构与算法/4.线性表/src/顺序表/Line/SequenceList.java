package 顺序表.Line;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {

    private T[] eles;
    private int N;

    public SequenceList(int capacity) {
        this.eles = (T[])new Object[capacity];
        this.N = 0;
    }

    //空置线性表
   public void clear() {
        this.N = 0;
   }

   //判断线性表是否为空,是返回true,否返回false
    public boolean isEmpty() {
      return N==0;
    }

    //获取线性表中元素的个数
    public int length() {
        return N;
    }

    //读取并返回线性表中的第i个元素的值
    public T get(int i) {
        return eles[i];

    }

    //像线性表中添加一个元素t
    public void insert(T t) {

        if (N==eles.length) {
            resize(2*eles.length);
        }
        eles[N++] = t;
    }
    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t) {
        if (N==eles.length) {
            resize(2*eles.length);
        }

        //先把索引i及之后的元素都以此向后移一个
        for (int index = N; index >i ; index--) {
                eles[index] =eles[index-1];
        }
        //再将t元素放到指定位置
        eles[i] = t;

        //让元素个数加一
        N++;

    }




    //删除并返回线性表中的第i个数据元素
    public T remove(int i) {
        //标记该元素
        T current = eles[i];
        for (int index = i; index < N-1; index++) {
            eles[index] = eles[index +i];
        }
        //元素个数减一
        N--;
        if (N<eles.length/4) {
            resize(eles.length/2);
        }
        return current;
    }

    //返回线性表中首次出现的指定的数据元素的位序号,若不存在,则返回-1
    public int indexOf(T t) {

        for (int index = 0; index < N; index++) {
            if (eles[index] == t) {
                return index;
            } else {
                return -1;
            }
        }
        return -1;
    }

    //更具newSize 充值eles大小
    public void resize(int newSize) {

        //定义一个临时数组,指向原数组
        T[] temp = eles;
        //创建新数组
        eles = (T[]) new Object[newSize];
        //把原数组的数据拷贝到新数组
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator {
        private int cusor;
        public SIterator() {
            this.cusor = 0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
