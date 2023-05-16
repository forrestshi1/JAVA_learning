package default2;
//synchronized代码块
public class SellT1 {
    public static void main(String[] args) {


        SellTicket03 sellTicket = new SellTicket03();
        //多个线程都使用同一个sellTicket对象作为锁对象，因此它们共享同一个锁
        new Thread(sellTicket).start();//第1个线程-窗口
        new Thread(sellTicket).start();//第2个线程-窗口
        new Thread(sellTicket).start();//第3个线程-窗口

    }
}


//实现接口方式, 使用synchronized实现线程同步
class Sell1 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;//控制run方法变量
    Object object = new Object();
    //每个线程在执行sell方法时，都会尝试获取object对象的锁。如果某个线程已经持有了该锁，其他线程就会被阻塞，直到持有锁的线程释放锁。



    public /*synchronized*/ void sell() { //同步方法, 在同一时刻， 只能有一个线程来执行sell方法

        synchronized (/*this*/ object) { //如果参数为this 则锁为实例对象
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }

            //休眠50毫秒, 模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));//1 - 0 - -1  - -2
        }
    }

    @Override
    public void run() {
        while (loop) {

            sell();//sell方法是一共同步方法
        }
    }
}