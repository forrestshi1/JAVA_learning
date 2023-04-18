public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hi i;m robot" + name;
    }

    public void performTask(String task) {
        System.out.println(name + "is doing " + task + "task！");
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("now the batteryLevel is " + batteryLevel + "%");
    }

    public void energyTransfer() {
        batteryLevel = 100;
        System.out.println("charge is over！");
    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("9527");
        System.out.println(myDroid);
        myDroid.performTask("clean up ");
        myDroid.energyReport();
        myDroid.energyTransfer();
        myDroid.energyReport();
    }
}