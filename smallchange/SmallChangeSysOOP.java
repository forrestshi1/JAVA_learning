package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    String details = "-----------------零钱通明细------------------";
    double money = 0;
    double balance = 0;
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static void main(String args[]) {
//        SmallChangeSysOOP smallChangeSysOOP = new SmallChangeSysOOP();
//        smallChangeSysOOP.show_menu(smallChangeSysOOP);
    }

    public void show_menu(SmallChangeSysOOP smallChangeSysOOP) {
        do {
        System.out.println("\n================零钱通菜单===============");
        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 消费");
        System.out.println("\t\t\t4 退     出");
        System.out.print("请选择(1-4): ");


            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            switch (key) {
                case "1":
                    smallChangeSysOOP.show_details();
                    break;
                case "2":
                    smallChangeSysOOP.income();
                    break;
                case "3":
                    smallChangeSysOOP.expend();
                    break;
                case "4":
                    smallChangeSysOOP.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    break;
            }
        } while (loop);
    }

    public void show_details() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("收益入账金额:");
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;
        }
        balance += money;
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void expend() {
        System.out.print("消费金额:");
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0-" + balance);
            return;
        }
        System.out.print("消费说明:");
        String note = scanner.next();
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        String choice = "";
        while (true) { //要求用户必须输入y/n ,否则就一直循环
            System.out.println("你确定要退出吗? y/n");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        } else {
            System.out.println("你选择了不退出");
        }


    }
}

