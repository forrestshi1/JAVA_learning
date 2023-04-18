 public class OverLoad {
	 //允许方法同名，但是传入参数不同
       public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int result1 = calculator.add(3, 4);  // 调用 add(int x, int y) 方法
            double result2 = calculator.add(2.5, 3.5);  // 调用 add(double x, double y) 方法
            int result3 = calculator.add(1, 2, 3);  // 调用 add(int x, int y, int z) 方法
            System.out.println("result1 = " + result1);
            System.out.println("result2 = " + result2);
            System.out.println("result3 = " + result3);
        }
       public static class Calculator{//必须要加static否则编译器无法确定该内部类的实例应该隶属于哪个外部类的实例
            public int add(int x, int y) {
                return x + y;
            }
            public double add(double x, double y) {
                return x + y;
            }
            public int add(int x, int y, int z) {
                return x + y + z;
            }
    }
    }


