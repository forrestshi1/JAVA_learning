import java.util.Arrays;
public class EmptyArray{  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;//声明一个字符串数组favoriteArticles
  
  public EmptyArray(){
    favoriteArticles = new String[10];//创建实例的同时让favoriteArticles长度为10
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    favoriteArticles[favoriteIndex] = newArticle;
  }//把索引为favoriteIndex的值赋为newArticle
    
  public static void main(String[] args){
	EmptyArray sampleFeed = new EmptyArray();   
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");  
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}