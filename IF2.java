public class IF2 {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public IF2(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;               
        /*当遇到 break 语句时，switch 语句终止。
		程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。
		如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。*/
      case "Express":    
        shippingCost = 1.75;
        break;
      default:               //在没有case语句和变量值相同时执行
        shippingCost = .50; 
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // create instances and call methods here!
	  IF2 myOrder = new IF2(true, 22, "Express");
        myOrder.calculateShipping();
        myOrder.ship();
  }
}