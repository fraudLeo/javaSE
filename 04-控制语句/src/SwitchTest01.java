/*
    关于switch 语句 :
        1.switch语句也属于选择结构,也是分支语句
        2.switch语句的语法结构:
            一个比较完整的switch语句应该这样编写:
                switch(_(int或String类型的字面值)) {

                    case int 或者String类型的字面值或者变量:
                    java语句;
                    break;(这一句看情况加)

                     case int 或者String类型的字面值或者变量:
                    java语句;
                    break;(这一句看情况加)

                     case int 或者String类型的字面值或者变量:
                    java语句;
                    break;(这一句看情况加)

                     case int 或者String类型的字面值或者变量:
                    java语句;
                    break;(这一句看情况加)

                    default:
                    java语句....;
                }

                假如匹配成功了之后没有执行break语句 那么就会进行下一个分支执行,这个被称为case的穿透现象

               * case 可以 合并:
               int i = 10;
               switch(i) {
               case 1: case 2 : case 3 : case 10 :
                  System.out.println("Test");
               }

 */
public class SwitchTest01 {
    public static void main(String[] args) {
        int cnt = 0;
        boolean isSuShu = true;
        for (int i = 2; i <=100 ; i++) {

            for (int j = 2; j <i/2 ; j++) {

                if(i%j == 0) {
                    isSuShu = false;
                    break;
                } else {
                    isSuShu = true;
                    }
            }

            if (isSuShu) {
                System.out.print(i + " ");
                cnt++;
                if (cnt == 8) {
                    System.out.print("\n");
                    cnt = 0;
                }
            }

        }
    }
}
