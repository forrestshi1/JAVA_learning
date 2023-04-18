//override 方法名 形参一样 返回值类型一样或为父亲子类 不能缩小父类方法访问范围
public class OverRide {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); 
        dog.makeSound(); 
    }
    
    
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        /*当一个方法被标记为@Override时，
        它必须具有与被重写的方法相同的名称、参数列表和返回类型，可以检查是否重写错误*/
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }

}

