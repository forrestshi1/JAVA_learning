package default2;
//线程终止
public class ThreadEnd {
    public static void main(String[] args) throws InterruptedException {
        cnt cnt1 = new cnt();
        Thread thread = new Thread(cnt1);
        thread.start();
        Thread.sleep(5000);//在5秒后终止线程cnt

        cnt1.setLoop(false);

    }
}

class cnt implements Runnable{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println("666");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
