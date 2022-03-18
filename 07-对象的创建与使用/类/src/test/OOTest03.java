package test;

import fangfa.Husband;
import fangfa.Wife;

public class OOTest03 {
    public static void main(String[] args) {

        Husband huangxiaoming = new Husband();
        huangxiaoming.name = "黄晓明";

        Wife baby = new Wife();
        baby.name =  "baby";


        huangxiaoming.w = baby;
        baby.h = huangxiaoming;

        //得到黄晓明的妻子的名字:
        System.out.println(huangxiaoming.name + " 的 妻子 的 名字是 "+ huangxiaoming.w.name);
    }
}
