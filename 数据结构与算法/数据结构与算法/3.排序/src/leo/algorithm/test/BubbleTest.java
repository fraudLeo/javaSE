package leo.algorithm.test;

import leo.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {

        Integer arr[] = {4,5,6,3,2,1};//Integer 是个包装类 里面实现了Comparable接口 向下兼容
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
