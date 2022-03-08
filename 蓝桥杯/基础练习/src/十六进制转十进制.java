import java.util.Scanner;

public class 十六进制转十进制 {
    public static void main(String[] args) {
        method1();
//        method2();
    }

    private static void method1() {

        Scanner sc = new Scanner(System.in);
        String strHex = sc.next();

        String strBin = toBin(strHex);

//        System.out.println(strBin);
        int len_strBin = strBin.length();

//        if (len_strBin%4==3) {
//            strBin+="0";
//        } if (len_strBin%4==2) {
//            strBin+="00";
//        }  if (len_strBin%4==1) {
//            strBin+="000";
//        }
        long strDec = toDec(strBin);
        System.out.println(strDec);
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

    private static long toDec(String strBin) {
//        System.out.println(strBin);
        long sum = 0;
        int len_strBin = strBin.length();
        for (int i = 1; i <= len_strBin; i++) {
            //第一位的数字是
            int dt = Integer.parseInt(strBin.substring(i-1,i));//因为i是取不到的所以上面的循环就这样
            sum+=(int)Math.pow(2,len_strBin-i)*dt;
        }
        return sum;
    }

    private static void method2() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char c[]=string.toCharArray();    //将字符串对象中的字符转换为一个字符数组
        //int sum = 0;
        long sum = 0;	//数据范围上，不超过8位的十六进制数，所以计算总和的sum应该声明为long型，而不是int型，否则会出错。
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if((int)c[i]-48>9){
                if(c[i]=='A')
                    sum+=10*Math.pow(16,n-i-1);
                else if(c[i]=='B')
                    sum+=11*Math.pow(16,n-i-1);
                else if(c[i]=='C')
                    sum+=12*Math.pow(16,n-i-1);
                else if(c[i]=='D')
                    sum+=13*Math.pow(16,n-i-1);
                else if(c[i]=='E')
                    sum+=14*Math.pow(16,n-i-1);
                else if(c[i]=='F')
                    sum+=15*Math.pow(16,n-i-1);
            }
            else{
                sum+=((int)c[i]-48)*Math.pow(16,n-i-1);
            }
        }
        System.out.println(sum);

    }
}
