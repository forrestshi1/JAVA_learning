public class Hash {
	//hashCode 返回哈希码
    private String name;
    private int age;

    public Hash(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override//重写hashCode方法 返回name的哈希值加年龄
    public int hashCode() {
        return name.hashCode() + age;
    }

    public static void main(String[] args) {
        Hash p1 = new Hash("Alice", 20);
        Hash p2 = new Hash("Bob", 30);
        Hash p3 = new Hash("Alice", 10);

        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());

        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
    }

    @Override//重写equals方法 
    public boolean equals(Object obj) {//Object是所有类的父类，因此任何一个对象都可以被当作Object类型来处理。
 //在使用Object类型作为方法参数时，需要进行类型转换才能访问其实际类型的成员变量和方法。
 //因此，我们通常使用instanceof操作符进行类型检查，以确保转换的安全性。      
    	if (obj instanceof Hash) {
            Hash other = (Hash) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}
