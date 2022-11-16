public class PumpComp {
    public static void main(String[] args) {
        High high = new High();
        int maxH = 30;
        Pumpkin one = new Pumpkin("one", high, maxH);
        Pumpkin two = new Pumpkin("two", high, maxH);
        one.start();
        two.start();
    }
}
