import java.util.Scanner;//import the scanner
public class Input { 
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);//create an object myScanner
		System.out.println("please input the name");

		//when java execute next method，it will wait for user to input
		String name = myScanner.next(); //to receive what user input
		System.out.println("age");
		int age = myScanner.nextInt(); //to receive what user input
		System.out.println("salary");
		double sal = myScanner.nextDouble(); //to receive what user input
		System.out.println("informations:");
		System.out.println("name=" + name 
			+ "age = " + age + "salary= " + sal);

	}
}