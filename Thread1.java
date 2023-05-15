package default2;


//继承Thread创建线程
public class Thread1 {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.start();//启动子线程，最终执行run方法
        //start方法将线程从新建状态转换到可运行状态，当线程获得CPU时间片时，便处于运行状态。
        //如果直接调用run方法，那么就是主线程执行run方法，没有开启新的线程，没有启动子线程


        int i = 0;
        //主线程，主线程是main方法的线程
        while (true) {
            System.out.println("いぬ");
            i++;
            if (i == 10) {
                break;
            }
            //主线程停止，子线程继续运行

            // 休眠1秒,用try-catch捕获异常,否则编译器报错
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}


class cat extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("ねこ");
            // 休眠1秒,用try-catch捕获异常,否则编译器报错
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
