//types with low precision are converted to large precision
//small to big ->   char->int->long->float->double
// byte -> short->int->long->float->double
/*When calculating, convert the data to the largest 
data type and then calculate, and the accuracy big 
data is assigned to the small precision will report an error*/
public class convert {
	public static void main(String[] args) {
		int a ='c';//true
		double d =80;// true
		byte b =10;
		char c =90;
		//  short s =b+c; false  //(byte short char) can't convert to each other 
		//  but can compute in int type
		System.out.println(b+c);
		
		
		 //Only the most recent number is manipulated in forceconvert
		//int x = (int)10*3.5+6*1.5;  false ： double -> int 
				int x = (int)(10*3.5+6*1.5);// (int)44.0 -> 44
				System.out.println(x);//44

// type char  can save int constants, but not int variables
				char c1 = 100; //ok
				int m = 100; //ok
				//char c2 = m; //错误
				char c3 = (char)m; //ok
				System.out.println(c3);//100 in ASCII, char d 

		
		
		
		
		}
	}