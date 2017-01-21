package Chapter_5;
public class Ex_5_13 {
public static void main(String[] args) {
    
    System.out.print("The largest number which to the power of 3 is less than 12000 is: ");
    
    int n = 12000;
    
    while (Math.pow(n, 3) > 12000)
        n--;
    
    System.out.print(n + "\n");
    
}    
}
