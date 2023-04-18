public class VarArgs {
  
  public static void main(String[] args) {
    VarArgs example = new VarArgs();
    example.sum(1, 2, 3);  
    example.sum(1, 2, 3, 4, 5);
  }
  public void sum(int... numbers) {/*在参数类型后加上...来定义，
  一个形参列表只能出现一个可变参数，可变参数是参数列表最后一个参数*/
    int total = 0;
    for (int num : numbers) {
      total += num;
    }
    System.out.println("Total: " + total);
  }
}
