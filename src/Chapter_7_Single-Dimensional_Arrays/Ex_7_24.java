package Chapter_7;
public class Ex_7_24 {
    public static void main(String[] args) {
        String[] deck = new String[52];
        Methods.deck(deck);
    //    System.out.println(java.util.Arrays.toString(deck));
        System.out.println("Number of picks: " + Methods.pickingCircle(deck));
    }
}
