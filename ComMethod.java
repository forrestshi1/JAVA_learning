public class ComMethod{
	public static void main(String args[]) {
		//“==”判断基本类型的值和引用类型的地址是否相等； equals判断引用类型内容是否相等
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s3 == s2); // true
	}
	
}