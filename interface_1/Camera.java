package interface_1;
////1.如果一个类 implements实现 接口
////2. 需要将该接口的所有抽象方法都实现
public class Camera implements UsbInterface, AInterface {//实现接口,就是把接口方法实现  可以实现多个接口

    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }


    @Override
    public void hi() {
        System.out.println("你好这里是相机");
    }

    @Override
    public void ok() {
        AInterface.super.ok();
    }
}
