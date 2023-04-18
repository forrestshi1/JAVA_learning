
public class Fibonacci {
    public static void main(String[] args) {
    	System.out.println(Fib(6));
    }

    public static int Fib(int i) {
    if(i == 1 || i==2) {
    	return 1;
    }
    else {
    	return Fib(i-1)+Fib(i-2);
    }
    }
}