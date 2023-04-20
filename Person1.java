public class Person1 {
    private String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //当您打印一个时，将调用该对象的toString()方法,默认返回：全类名+@+哈希值的十六进制
    //所以一般需要重写
    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }

    public static void main(String[] args) {
        Person1 p = new Person1("Alice", 20);
        System.out.println(p); // output: Person(name=Alice, age=20)
    }
}
