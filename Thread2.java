package default2;


//通过实现Runnable接口创建线程
public class Thread2 {
    public static void main(String[] args) {
        dog dog1 = new dog();
        //不能用start方法，因为dog类没有继承Thread类

        //创建Thread对象，将dog1对象作为参数传入
        Thread thread = new Thread(dog1);
        thread.start();

    }
}

class dog implements Runnable {

    int i = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("いぬ"+(i++));
            // 休眠1秒,用try-catch捕获异常,否则编译器报错
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}