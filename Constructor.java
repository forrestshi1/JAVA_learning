public class Constructor {
    private String name;
    private int age;
    
    // 构造器方法
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Constructor() {
    }
    
    
    // 非构造器方法
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        // 使用构造器初始化属性
        Constructor person1 = new Constructor("Alice", 25);
        System.out.println("Name: " + person1.name + ", Age: " + person1.age);
        
        // 使用非构造器方法初始化属性
        Constructor person2 = new Constructor();
        person2.setName("Bob");
        person2.setAge(30);
        System.out.println("Name: " + person2.name + ", Age: " + person2.age);
    }
}
