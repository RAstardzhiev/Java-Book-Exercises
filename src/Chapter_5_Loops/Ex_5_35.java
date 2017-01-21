package Chapter_5;
public class Ex_5_35 {
public static void main(String[] args) {
    
    double sum = 1 / (1 + Math.sqrt(2));
//    System.out.print(sum + "\n");
    
    for (int i = 2, s = 3; i <= 624 && s <= 625; i++, s++)
        sum += 1 / (Math.sqrt(i) + Math.sqrt(s));

    System.out.println(sum);
    
}    
}
