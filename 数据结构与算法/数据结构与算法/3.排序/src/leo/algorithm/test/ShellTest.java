package leo.algorithm.test;

import leo.algorithm.sort.Shell;

import java.util.Arrays;

public class ShellTest {

    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
