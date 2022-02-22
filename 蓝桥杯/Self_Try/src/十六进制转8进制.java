import java.util.Scanner;

public class 十六进制转8进制 {
    public static void main(String[] args) {
        Method();
    }

    private static void Method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//输入几个要转的数据?
        String strHex[] = new String[n];
        for (int i = 0; i < n; i++) {
            strHex[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            String strBin = toBin(strHex[i]);//从16进制转换成2进制

            int len_strBin = strBin.length();
            if (len_strBin%3==1) {
                strBin +="00";
            }
            if (len_strBin%3==2) {
                strBin+="0";
            }
            String strOct = toOct(strBin);
            System.out.println(strOct);
        }
    }

    private static String toBin(String strHex) {
        StringBuffer sBuffer = new StringBuffer();
        int len_strHex = strHex.length();
        for (int i = 0; i < len_strHex; i++) {
            switch (strHex.charAt(i)) {
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

    private static String toOct(String strBin) {
        int k;                              //定义开始循环位置
        StringBuffer sBuffer = new StringBuffer();
        int len_strBin = strBin.length();
        if (strBin.substring(0,3).equals("000")) {
            k = 3;
        } else {
            k = 0;
        }
        for (int i = k; i < len_strBin; i+=3) {//每次进3个步长
            switch (strBin.substring(i,i+3)) {
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
