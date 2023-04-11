import java.util.ArrayList;
public class PrimeDirective {
	public static boolean func1(int a) {
		if(a == 1 || a == 2) {
    		return true;
    	}
		else {
			for(int i = 2;i<a;i++) {				
					if(a%i == 0) {
						return false;					
				}
			}
			return true;
		}
	}//制作一个简单的素数筛
	
	
	public static void func(int[] numbers,ArrayList <Integer> a1) {
		for(int number : numbers) {
	    	if(func1(number)) {
	    		a1.add(number);
	    	}
	    }
	}//得到素数时加入数组

	
	
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    ArrayList <Integer> a1 =new ArrayList <Integer>();
    func(numbers,a1);
    System.out.println(a1);
  }  

}