public class TArrayAddress{
	public static void main(String args[]) {
	int arr[][] = new int[2][3];
	arr[1][1] = 8;
	System.out.println(arr);//整个数组的地址
	System.out.println(arr[0]);//第一行的的地址
	System.out.println(arr[1]);//第一行的的地址
	
}
}