package innerclass;
/**
 * 演示匿名内部类的使用,在外部类的方法里面创建一个匿名内部类
 */
//匿名内部类既是一个类，又是一个对象。
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();


    }
}

class Outer04 { //外部类
    private int n1 = 10;//外部类的变量 private类型
    //基于接口的匿名内部类
    public void method() {//外部类的方法
        //tiger的编译类型 -> IA   tiger的运行类型 -> Outer04$1
        /*
            以下代码等于
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        IA tiger = new IA() {//匿名内部类
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();

        //传统方法
        class tt implements IA {
            @Override
            public void cry() {
                System.out.println("tt...");
            }
        }
        IA t = new tt();
        t.cry();

        //基于类的匿名内部类
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

interface IA {//接口
    public void cry();
}

class Father {//类
    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }
    public void test() {//方法
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}

