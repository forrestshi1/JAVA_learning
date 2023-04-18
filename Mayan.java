package inher;

class Mayan extends Language{
    Mayan(String languageName, int speakers) {
    super(languageName, speakers, "Central America", "verb-object-subject");//super可以调用父类构造方法以初始化成员变量，也可以引用父类成员变量和方法
  }
    
    @Override// 改写父类同名方法
    public void getInfo() {
   
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
      System.out.println("Fun fact: " + this.name + " is an ergative language.");
   
    }
}