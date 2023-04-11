import java.util.ArrayList;

public class ForEach {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    for(double expense : expenses){   
    	                                     /*for(元素类型t 元素变量x : 遍历对象obj){ 
        	                                   引用了x的java语句; */
     
      if(expense > mostExpensive)
      {
        mostExpensive = expense;
      }
    }
    
    System.out.println(mostExpensive);
    
  }
  
}