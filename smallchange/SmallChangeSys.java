package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "-----------------零钱通明细------------------";
        double money = 0;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的
        String note = "";
        do {

            System.out.println("\n================零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.print("请选择(1-4): ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    if(money <= 0) {
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;


                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance) {
                        System.out.println("你的消费金额 应该在 0-" + balance);
                        break;
                    }
                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date(); //获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) { //要求用户必须输入y/n ,否则就一直循环
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //当用户退出while ,进行判断
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);

        System.out.println("-----退出了零钱通项目-----");

    }
}