public class XORandTertiary { //tertiary operator
	public static void main(String[] args) {
		boolean b = (10>1)^(3>5);//ab不同时为true
		System.out.println(b);
		int a =10;
		int c =99;
		int res = a>c?a++:c--; //if true then a++ else c--
		System.out.println(res);
	}
}