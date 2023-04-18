// import the Arrays package here:
import java.util.Arrays;//导入java.tuil.arrays类库
public class ImportArray {
  
  
  public ImportArray(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
  
    return topics;
  }
  

  public static void main(String[] args){
	ImportArray sampleFeed = new ImportArray();
    String[] topics = sampleFeed.getTopics();
    System.out.println(Arrays.toString(topics));//如果不使用tostring 会输出数组地址
  }
}
