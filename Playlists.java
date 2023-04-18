import java.util.ArrayList;

public class Playlists {
  
  public static void main(String[] args) {
    ArrayList <String> desertIslandPlaylist =new ArrayList <String>();
    desertIslandPlaylist.add("i'm yours");//add playlist
    desertIslandPlaylist.add("shape of u");
    desertIslandPlaylist.add("peaches");
    desertIslandPlaylist.add("uptown funk");
    desertIslandPlaylist.add("baby");
    desertIslandPlaylist.add("die for love");
    System.out.println(desertIslandPlaylist);//print what the list have
    System.out.println(desertIslandPlaylist.size());//to see the size of list
    desertIslandPlaylist.remove("die for love");//delete the songs of list
    String b = desertIslandPlaylist.get(1);//get the value of array with index
    System.out.println(b);
    int b1 = desertIslandPlaylist.indexOf(b);//find index and trans it to b1
    desertIslandPlaylist.set(b1, "life is worth living");//change the value of index b
    
      ;
  }
  
}