package Chapter_7;
public class Ex_7_4 {
    public static void main(String[] args) {
        double[] d = Methods.createArray();
        System.out.println("\nYou entered: \n" + java.util.Arrays.toString(d));
        double avarage = Methods.sumArray(d) / 2;
        Methods.printTheRest(d);
    }
}
