package Chapter_8;
public class Ex_8_13 {
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double array[][] = new double[rows][columns];
        
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextDouble();
        int[] place = locateLargest(array);
        System.out.println("The location of the largest element is at (" + place[0] + ", " + place[1] + ")");
    }
    
    public static int[] locateLargest(double[][] a) {
        int[] re = new int[2];
        
        // find Max
        double max = 0;
        
        for (int i = 0; i < a.length; i++) { // "i" is row
            for (int j = 0; j < a[i].length; j++) { // "j" is column
                if (a[i][j] > max) {
                    max = a[i][j];
                    re[0] = i;
                    re[1] = j;
                }
            }
        }
        
        return re;
    }
    
}
