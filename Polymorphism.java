
public class Polymorphism {
    public static void main(String[] args) {
    	class Animal {
    	    public void makeSound() {
    	        System.out.println("This is an animal");
    	    }
    	}

    	class Cat extends Animal {
    	    public void makeSound() {
    	        System.out.println("Meow");
    	    }
    	    
    	    public void scratch() {
    	        System.out.println("Cat is scratching");
    	    }
    	}

    	class Dog extends Animal {
    	    public void makeSound() {
    	        System.out.println("Woof");
    	    }
    	}
    								//向上转型： 父亲引用指向子类对象
        Animal animal1 = new Cat();//编译类型看左边，运行类型看右边
        Animal animal2 = new Dog();	//可以调用父类所有成员，不能调用子类特有成员
        
        Animal animal = new Cat();
        animal.makeSound(); 
        if(animal instanceof Cat) {      //使用 instanceof ,判断对象运行类型是否为Cat或子类
            Cat cat = (Cat) animal;		// 调用Cat类中独有的方法 即向下转型 强转父类的引用而不是父类对象
            cat.scratch();
        }
        
        animal1.makeSound();
        animal2.makeSound();
        
    }
}
