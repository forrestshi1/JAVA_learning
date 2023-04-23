package interface_1;

public class Interface01 {



    public static void main(String[] args) {
        //创建手机，相机对象
        //Camera 实现了 UsbInterface
        Camera camera = new Camera();
        //Phone 实现了 UsbInterface
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机
        System.out.println("===============");
        computer.work(camera);//把相机接入到计算机
        camera.hi();//调用普通方法
        camera.ok();//调用默认方法，实现类可以选择继承接口中的默认方法，也可以重写这些方法来提供自己的实现。
        AInterface.cry();//调用接口中的静态方法，静态方法是和类相关联的，而不是和对象实例相关联的。
                         // 因此，调用接口中的静态方法时，应该使用接口名来访问静态方法，而不是通过实现类的实例来访问。



    }
}
