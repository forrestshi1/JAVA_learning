package default2;
//synchronized方法
public class SellT2 {
    public static void main(String[] args) {


        SellTicket03 sellTicket = new SellTicket03();

        //多个线程都使用同一个sellTicket对象作为锁对象，因此它们共享同一个锁,实现同步
        /*如果有多个对象，并且每个对象都启动了一个线程，在线程内部的数据是相互独立的，互不干扰。
        * 每个对象拥有自己的实例变量，线程在运行时会操作自己所属对象的实例变量。因此，不同对象的线程之间的数据是隔离的，它们互不干扰。
        * */




        new Thread(sellTicket).start();//第1个线程-窗口
        new Thread(sellTicket).start();//第2个线程-窗口
        new Thread(sellTicket).start();//第3个线程-窗口

    }
}


//实现接口方式, 使用synchronized实现线程同步
class Sell2 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;//控制run方法变量
    //因为多个线程使用的是同一个sellTicket对象，它们都会共享同一个锁。只有一个线程可以获取锁





    public synchronized void sell() { //同步方法默认使用的锁对象就是方法所属的实例对象，也就是this。因此，每个线程在执行sell方法时，都会尝试获取sellTicket对象的锁。


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


    @Override
    public void run() {
        while (loop) {

            sell();//sell方法是一共同步方法
        }
    }
}


/*对于synchronized修饰的实例方法：

当一个线程调用这个方法时，它会尝试获取当前实例对象的锁。
如果锁是可用的（没有被其他线程持有），该线程将获取锁并执行方法体中的代码。
如果锁被其他线程持有，那么该线程将被阻塞，直到锁被释放为止。阻塞的线程会进入等待队列，并在锁被释放后重新竞争获取锁。
只有一个线程可以同时持有该实例对象的锁，因此同一时刻只有一个线程可以执行被synchronized修饰的实例方法。


对于synchronized修饰的代码块：

代码块使用指定的锁对象作为同步锁。
当一个线程进入代码块时，它会尝试获取该锁对象。
如果锁对象是可用的，该线程将获取锁并执行代码块中的代码。
如果锁对象被其他线程持有，那么该线程将被阻塞，直到锁对象被释放为止。
不同线程可以同时执行不同的synchronized代码块，只要它们使用的是不同的锁对象。
如果多个线程使用相同的锁对象，则同一时刻只有一个线程可以执行被synchronized修饰的代码块。*/