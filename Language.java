package inher;

public class Language {
    
    protected String name;//can be used in class package and child class
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 5500000, "Spain", "subject-verb-object");
        spanish.getInfo();
        Mayan kiche = new Mayan("Ki che",230000);// = mayan can be changed into Language
        kiche.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();
        
    }
}
