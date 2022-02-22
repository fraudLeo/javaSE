import java.util.Scanner;

public class 十六进制转八进制 {
    public static void main(String[] args) {
//        十六进制转八进制.test1();
        十六进制转八进制.test2();
    }
    static void test1() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toOctalString(Integer.valueOf(arr[i],16)));

        }

    }//利用程序本身16转8
    static void test2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.next();
        }
        sc.close();


        //先将16进制转二进制,再将二进制转换成8进制
        /**
            System.out.println(Long.toBinaryString(i));  //返回i的二进制的字符串表示
            System.out.println(Long.toOctalString(i));  //返回i的八进制的字符串表示
            System.out.println(Long.toHexString(i));  //返回i的十六进制的字符串表示
            System.out.println(Long.toString(i, 10));  //返回i的p进制的字符串表示
         */

        for (int i = 0; i < n; i++) {
            String strBin = toBary(arr[i]);
            int len_strBin = strBin.length();

            //补位,因为害怕出现    类似   1   而不是  001 这样的情况
            if(len_strBin%3==1) {
                strBin = "00" + strBin;
            }
            if (len_strBin%3==2) {
                strBin = "0" + strBin;
            }
            String strOct = toOct(strBin);
            System.out.println(strOct);
        }
    }



    private static String toBary(String strHex) {
        int len_strHex =strHex.length();

        /**
         * 在 Java 中，除了通过 String 类创建和处理字符串之外，还可以使用 StringBuffer 类来处理字符串。
         * StringBuffer 类可以比 String 类更高效地处理字符串。
         *
         * 因为 StringBuffer 类是可变字符串类，创建 StringBuffer 类的对象后可以随意修改字符串的内容。
         * 每个 StringBuffer 类的对象都能够存储指定容量的字符串，如果字符串的长度超过了 StringBuffer 类对象的容量
         * 则该对象的容量会自动扩大。
         */
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < len_strHex; i++) {
            switch (strHex.charAt(i)) {
                //sBuffer.append() 代表的是修改值
                case '0' : sBuffer.append("0000");break;
                case '1' : sBuffer.append("0001");break;
                case '2' : sBuffer.append("0010");break;
                case '3' : sBuffer.append("0011");break;
                case '4' : sBuffer.append("0100");break;
                case '5' : sBuffer.append("0101");break;
                case '6' : sBuffer.append("0110");break;
                case '7' : sBuffer.append("0111");break;
                case '8' : sBuffer.append("1000");break;
                case '9' : sBuffer.append("1001");break;
                case 'A' : sBuffer.append("1010");break;
                case 'B' : sBuffer.append("1011");break;
                case 'C' : sBuffer.append("1100");break;
                case 'D' : sBuffer.append("1101");break;
                case 'E' : sBuffer.append("1110");break;
                case 'F' : sBuffer.append("1111");break;
                default:
                    break;
            }
        }
        return sBuffer.toString();
    }

    private static String toOct(String strBina) {
        StringBuffer sBuffer = new StringBuffer();
        int len_strbin = strBina.length();
        int k;

        if (strBina.substring(0,3).equals("000")) {
            k = 3;
        } else {
            k = 0;
        }

        for (int i = k; i < len_strbin-2; i+=3) {

            switch (strBina.substring(i,i+3)) {
                case "000" : sBuffer.append("0"); break;
                case "001" : sBuffer.append("1"); break;
                case "010" : sBuffer.append("2"); break;
                case "011" : sBuffer.append("3"); break;
                case "100" : sBuffer.append("4"); break;
                case "101" : sBuffer.append("5"); break;
                case "110" : sBuffer.append("6"); break;
                case "111" : sBuffer.append("7"); break;
                default:
                    break;
            }

        }
        return sBuffer.toString();


    }


}
