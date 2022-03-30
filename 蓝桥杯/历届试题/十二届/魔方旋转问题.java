package 十二届;

import java.util.Scanner;

public class 魔方旋转问题 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        //初始化每个面
        char[] x_front = {'G','G','G','G'};
        char[] x_behind = {'B','B','B','B'};
        char[] y_front = {'R','R','R','R'};
        char[] y_behind = {'O','O','O','O'};
        char[] z_front = {'W','W','W','W'};
        char[] z_behind = {'Y','Y','Y','Y'};


        Scanner sc = new Scanner(System.in);
        //读取输入的字符,并将其转换为 数组
        String operation_inPut_str = sc.nextLine().toString();
        String[] operation_inPut_array = operation_inPut_str.split("");

        for (String s : operation_inPut_array) {
            switch (s) {
                case "x": exch_x_move( x_front, x_behind, y_front, y_behind, z_front,z_behind);break;
                case "y": exch_y_move( x_front, x_behind, y_front, y_behind, z_front,z_behind);break;
                case "z": exch_z_move( x_front, x_behind, y_front, y_behind, z_front,z_behind);break;
                default:
                    break;
            }
        }
        char[] final_show = {x_front[1],y_front[0],z_front[2]};

        for (char c : final_show) {
            switch (c) {
                case 'G' :
                    System.out.print("绿");break;
                case 'B' :
                    System.out.print("蓝");break;
                case 'R' :
                    System.out.print("红");break;
                case 'O' :
                    System.out.print("橙");break;
                case 'W' :
                    System.out.print("白");break;
                case 'Y' :
                    System.out.print("黄");break;

            }

        }


    }

     static void exch_x_move( char[] x_front,char[] x_behind, char[] y_front, char[] y_behind, char[] z_front, char[] z_behind) {
         change4ColorInOne(x_front);

         char[] temp = new char[2];
         temp[0] = z_front[2];
         temp[1] = z_front[3];

         z_front[2] = y_behind[1];
         z_front[3] = y_behind[2];

         y_behind[1] = z_behind[0];
         y_behind[2] = z_behind[1];

         z_behind[0] = y_front[3];
         z_behind[1] = y_front[0];

         y_front[3] = temp[0];
         y_front[0] = temp[1];

     }

    static void exch_y_move( char[] x_front,char[] x_behind, char[] y_front, char[] y_behind, char[] z_front, char[] z_behind) {

        change4ColorInOne(y_front);

        char[] temp = new char[2];

        temp[0] = x_front[1];
        temp[1] = x_front[2];

        x_front[1] = z_behind[1];
        x_front[2] = z_behind[2];

        z_behind[1] = x_behind[1];
        z_behind[2] = x_behind[2];

        x_behind[1] = z_front[1] ;
        x_behind[2] = z_front[2] ;

        z_front[1] = temp[0];
        z_front[2] = temp[1];

    }

    static void exch_z_move( char[] x_front,char[] x_behind, char[] y_front, char[] y_behind, char[] z_front, char[] z_behind) {

        change4ColorInOne(z_front);

        char[] temp = new char[2];

        temp[0] = x_behind[2];
        temp[1] = x_behind[3];

        x_behind[2] = y_behind[0];
        x_behind[3] = y_behind[1];

        y_behind[0] = x_front[0];
        y_behind[1] = x_front[1];

        x_front[0] = y_front[0];
        x_front[1] = y_front[1];
    }

    static void change4ColorInOne(char[] arr) {
        char temp;
        temp = arr[0];
        arr[0]  = arr[3];
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = temp;
    }


}
