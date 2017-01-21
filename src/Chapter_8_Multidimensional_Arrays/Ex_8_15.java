package Chapter_8;
public class Ex_8_15 {
    
    public static void main(String[] args) {
        double[][] p = new double[5][2];
        while (true) {
            int count = 0;
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter (x) and (y) for five points: ");
            for (int i = 0; i < p.length; i++)
                for (int j = 0; j < p[i].length; j++, count++)
                    p[i][j] = input.nextDouble();
            if (count == 10)
                break;
            else System.out.println("Wrong input. Try again\n");
        }
        if (sameLine(p))
                System.out.println("The five points are on the same line");
            else System.out.println("The five points are NOT on the same line");
    }
    
    public static boolean sameLine(double[][] p) {
        // (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        // ^ if = 0 --> Then p2 is on the same line
        // x0 = p[0][0]
        // y0 = p[0][1]
        // x1 = p[1][0]
        // y1 = p[1][1]
        for (int i = 2; i < p.length; i++) {
                if ((p[1][0] - p[0][0]) * (p[i][1] - p[0][1]) - (p[i][0] - p[0][0]) * (p[1][1] - p[0][1]) != 0)
                    return false;
        }
        return true;
    }
    
}
