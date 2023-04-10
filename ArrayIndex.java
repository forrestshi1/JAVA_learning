import java.util.Arrays;

public class ArrayIndex {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};//记录每个主题被浏览的次数
  
  public ArrayIndex(){
  }//用于创造ArrayIndex对象
    
  public String[] getTopics(){
    return topics;
  }//返回topics数组
  
  public String getTopTopic(){
    return topics[0];
  }//返回topics数组的第一个元素
  
  public void viewTopic(int topicIndex){
   views[topicIndex] =views[topicIndex] + 1;//增减索引
  }
  public static void main(String[] args){
	ArrayIndex sampleFeed = new ArrayIndex(); //创建ArrayIndex数组实例sampleFeed  
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());   //输出topics第一个值
    sampleFeed.viewTopic(1);    //实例sampleFeed.views数组中view[1]的值加1
    sampleFeed.viewTopic(1);	
    sampleFeed.viewTopic(3);	//实例sampleFeed.views数组中view[3]的值加1
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }//
}
