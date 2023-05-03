package default1;
import java.lang.StringBuffer;//必须导入
import java.util.Scanner;
        /*
        输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
        商品名	商品价格
        手机	123,564.59  //比如 价格 3,456,789.88

        要求：价格的小数点前面每三位用逗号隔开, 在输出。

        思路分析
        1. 定义一个Scanner 对象，接收用户输入的 价格(String)
        2. 希望使用到 StringBuffer的 insert ，需要将 String 转成 StringBuffer
        3. 然后使用相关方法进行字符串的处理
        代码实现

         */


public class SBclassExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String name = scanner.next();
        System.out.println("请输入商品价格：");

        String price1 = scanner.next();
        StringBuffer sb = new StringBuffer(price1);
        if(sb.indexOf(".") == -1){
            sb = sb.append(".00");
        }//如果没有小数点，就加上小数点
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }//每隔三位加一个逗号
        System.out.println("商品名称："+name+"\n"+"商品价格："+sb);

    }
}
