package Chapter_5;
public class Ex_5_12 {
public static void main(String[] args) {
    
    System.out.print("The smallest number multiplied by itself and greater than 12000 is: ");
    
    int n = 0;
    
    while (Math.pow(n, 2) < 12000) 
        n++;
    
    System.out.print(n + "\n");
    
}    
}
