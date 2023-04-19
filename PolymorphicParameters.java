public class PolymorphicParameters {
    public static void main(String[] args) {
    	abstract class Animal {
    	    public abstract void makeSound(); //抽象方法：
    	    /*抽象类不能被实例化，只能被继承。
    	     *抽象类的主要作用是作为其他类的父类，提供一些共性的方法和属性，并定义一些抽象方法，由子类来实现这些抽象方法。
    	     *抽象方法必须被声明在抽象类中，子类必须实现抽象类中的所有抽象方法，否则子类也必须声明为抽象类。 */
    	}

    	class Cat extends Animal {
    	    public void makeSound() {
    	        System.out.println("Meow");
    	    }
    	}

    	class Dog extends Animal {
    	    public void makeSound() {
    	        System.out.println("Woof");
    	    }
    	}

    	class AnimalSound {
    	    public static void makeSound(Animal animal) {
    	        animal.makeSound();
    	    }
    	}

    	
    	
    	
        Animal cat = new Cat();
        Animal dog = new Dog();

        AnimalSound.makeSound(cat);
        AnimalSound.makeSound(dog);//可用转型对象作为参数
    }
}
