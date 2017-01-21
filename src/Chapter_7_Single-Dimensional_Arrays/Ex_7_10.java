package Chapter_7;
public class Ex_7_10 {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");
        double[] d = new  double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < d.length; i++)
            d[i] = input.nextDouble();
        System.out.println("\nYou entered\n" + java.util.Arrays.toString(d));
        String place = "";
        switch (Methods.indexOfSmallestElement(d)) {
            case 0: place = "first"; break;
            case 1: place = "second"; break;
            case 2: place = "third"; break;
            default: place = Methods.indexOfSmallestElement(d) + "th";
        }
        System.out.println("\nThe minimum number is at the " + place + " position");
    }
}
