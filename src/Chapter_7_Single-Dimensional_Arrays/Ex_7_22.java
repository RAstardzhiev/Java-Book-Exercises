package Chapter_7;
public class Ex_7_22 {
    public static void main(String[] args) {
        int array[] = new int[8];
        for (int i = 1; i <= array.length; i++)
            array[i - 1] = i;
        System.out.println(java.util.Arrays.toString(array));
        Methods.arrangePositions(array);
        System.out.println(java.util.Arrays.toString(array));
        System.out.println();
        Methods.printChess(array);
    }
}
