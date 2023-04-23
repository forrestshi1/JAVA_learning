package interface_1;

public class Computer {
    public void work(UsbInterface usbInterface) {
        //1. UsbInterface usbInterface 形参是接口类型 UsbInterface
        //2. 看到 接收 实现了 UsbInterface接口的类的对象实例
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
