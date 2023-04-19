public class PolymorphicArray {
    public static void main(String[] args) {
    	abstract class Animal {
    	    public abstract void makeSound();
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
	
        Animal[] animals = new Animal[4];//每个数组元素都是对象
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
