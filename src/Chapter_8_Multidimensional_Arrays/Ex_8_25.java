package Chapter_8;
public class Ex_8_25 {
    
    public static void main(String[] args) {
        double[][] m = userInput();
        System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is not a Markov matrix");
    }
    
    public static double[][] userInput() {
        double[][] d = new double[3][3];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i < d.length; i++)
            for (int j = 0; j < d[i].length; j++)
                d[i][j] = input.nextDouble();
        return d;
    }
    
    public static boolean isMarkovMatrix(double[][] m) {
        for(int column = 0; column < m[0].length; column++) {
            double sum = 0;
            for (int row = 0; row < m.length; row++) {
                if (row > m.length - 1) break;
                if (m[row][column] < 0) return false;
                sum += m[row][column];
            }
//            System.out.println("Sum is: " + sum);
            if (sum != 1) return false;
        }
            
        return true;
    }
    
}
