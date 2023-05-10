package default2;

import java.util.ArrayList;
import java.util.List;

public class Generic03 {
    public static void main(String[] args) {
        //注意，特别强调： E具体的数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型

        //1.给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>(); //OK
        //List<int> list = new ArrayList<int>();//错误

        Person<String> person = new Person<String>("forrest");
        person.show();//String

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();//Integer

        Person<Double> person3 = new son<Double>(100.0);
        person3.show();//Double.在给泛型指定具体类型后，可以传入该类型或者其子类类型,这里的子类是son

        //2. 泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        //在实际开发中，我们往往简写
        //编译器会进行类型推断, 推荐使用下面写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        //4. 如果是这样写 泛型默认是 Object
        ArrayList arrayList = new ArrayList();//等价 ArrayList<Object> arrayList = new ArrayList<Object>();

    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
// 或者是某个方法的返回值的类型，或者是参数类型

class Person<E> {
    E s ;//E表示 s的数据类型, 该数据类型在定义Person对象的时候指定,即在编译期间，就确定E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }

    public E f() {//返回类型使用E
        return s;
    }

    public void show() {
        System.out.println(s.getClass());//显示s的运行类型
    }
}

class son<E> extends  Person<E> {
    public son(E s) {
        super(s);
    }//子类继承父类，指定父类的泛型
}
