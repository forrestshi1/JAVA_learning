package default1;

public class CustomException1 {

    public static void main(String[] args) {
        int age = 10;
        if ((age < 0) || (age > 120)) {
            throw new CustomException("年龄不合法");
        }
        System.out.println("您的年龄是：" + age);

//创建自定义异常类

    }
}

//创建自定义异常类
//自定义异常类必须继承Exception或其子类，通常是RuntimeException。
class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}