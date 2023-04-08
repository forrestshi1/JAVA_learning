public class easyCalc{
  public easyCalc(){

  }//允许我们在需要创建 easyCalc 类的实例时，使用默认构造函数来初始化新对象的状态

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
	easyCalc myCalculator = new easyCalc();
    int a = myCalculator.add(5,7);
    int b = myCalculator.subtract(45,11);
    System.out.println(a);
    System.out.println(b);
  }
}