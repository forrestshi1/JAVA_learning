//一个源文件中最多只能有一个public类。其它类的个数不限。
//Dog 是一个类
//编译后，每一个类，都对于一个.class
//编译不同的非public类 就可以进入其他的方法入口

public class method_of_non_public_class{
	public static void main(String[] args) {
		System.out.println("hello, java");
	}
}
class Dog {
	//一个源文件中最多只能有一个public类。其它类的个数不限，也可以将main方法写在非public类中，
	//然后指定运行非public 类，这样入口方法就是非public 的main方法
	public static void main(String[] args) {
		System.out.println("hello, 小狗狗~");
	}
}

class Tiger {

	public static void main(String[] args) {
		System.out.println("hello, 小老虎~");
	}

}
