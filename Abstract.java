// 抽象类
abstract class Shape {//不能被实例化
    // 抽象方法，必须在子类中被实现，不能使用修饰符
    public abstract double getArea();

    // 普通方法，可以在抽象类中直接实现
    public void printArea() {
        System.out.println("The area is: " + getArea());
    }
}

// 子类，继承自抽象类
 class Circle extends Shape {
    // 圆的半径
    private double radius;

    // 构造函数
    public Circle(double radius) {
        this.radius = radius;
    }

    // 实现抽象方法，计算圆的面积
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// 子类，继承自抽象类
 class Rectangle extends Shape {
    // 矩形的长和宽
    private double length;
    private double width;

    // 构造函数
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 实现抽象方法，计算矩形的面积
    @Override
    public double getArea() {
        return length * width;
    }
}

// 测试代码
public class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        circle.printArea(); // 打印圆的面积
        rectangle.printArea(); // 打印矩形的面积
    }
}
