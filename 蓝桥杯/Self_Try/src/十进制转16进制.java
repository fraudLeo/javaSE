import java.util.Scanner;

public class 十进制转16进制 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        int intDec = sc.nextInt();

        String strBin = toBin(intDec);
//        System.out.println(strBin);
        int len_strBin = strBin.length();
        if(len_strBin%4==3) {
            strBin="0"+strBin;
        }
        if (len_strBin%4==2) {
            strBin="00"+strBin;
        }
        if (len_strBin%4==1) {
            strBin="000"+strBin;
        }
        String strHex = toHex(strBin);
//        System.out.println(strBin);
        System.out.println(strHex);

    }


    private static String toBin(int intDec) {

        String strBin = "";
        while (intDec>=1) {
            if (intDec % 2!=0) {
                strBin  = "1" + strBin;

            } else {
                strBin = "0" + strBin;
            }
            intDec = intDec/2;
        }
        if (intDec == 0) {
            strBin = "0000";
        }
        System.out.println(strBin);
        return strBin;
    }
    private static String toHex(String strBin) {
        StringBuffer sBuffer = new StringBuffer();
        int len_strBin = strBin.length();
        int k ;
        if (strBin.substring(0,4).equals("0000")) {
            k = 4;
        } else {
            k = 0;
        }
//        System.out.println(strBin);
        if (strBin=="0000") {
            return "0";
        }
        else {
            for (int i = k; i < len_strBin-3 ; i+=4) {
                switch(strBin.substring(i,i+4)) {
                    case "0000" : sBuffer.append('0');break;
                    case "0001" : sBuffer.append('1');break;
                    case "0010" : sBuffer.append('2');break;
                    case "0011" : sBuffer.append('3');break;
                    case "0100" : sBuffer.append('4');break;
                    case "0101" : sBuffer.append('5');break;
                    case "0110" : sBuffer.append('6');break;
                    case "0111" : sBuffer.append('7');break;
                    case "1000" : sBuffer.append('8');break;
                    case "1001" : sBuffer.append('9');break;
                    case "1010" : sBuffer.append('A');break;
                    case "1011" : sBuffer.append('B');break;
                    case "1100" : sBuffer.append('C');break;
                    case "1101" : sBuffer.append('D');break;
                    case "1110" : sBuffer.append('E');break;
                    case "1111" : sBuffer.append('F');break;
                    default:
                        break;
                }
            }
            return sBuffer.toString();
        }

    }
}
