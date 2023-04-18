public class Encapsulation {
	//封装三步 设置private变量 设置public set方法设置值 设置public get方法 获取值
    private String name;
    private int age;

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation student = new Encapsulation("张三", 18);
        String name = student.getName();
        int age = student.getAge();
        System.out.println(name + "今年" + age + "岁。");

        student.setName("李四");
        student.setAge(19);
        name = student.getName();
        age = student.getAge();
        System.out.println(name + "明年" + age + "岁了。");
    }
}
