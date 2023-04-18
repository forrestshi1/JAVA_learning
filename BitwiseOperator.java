public class BitwiseOperator { //tertiary operator
	public static void main(String[] args) {
		int a = 1>>2; //00000001->00000000 == 1/2/2 =0
		int b = 1<<2; //00000001->00000100 == 1*2*2 =4
		int e =3>>>2;//移除最低的两个位，然后在左侧填充两个0
		System.out.println(a);
		System.out.println(b);
		System.out.println(~b);//00000100->11111011 -1算反码：11111010 原码：11110101
		System.out.println(e);
		
	}
}