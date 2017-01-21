package Chapter_4;
public class Ex_4_16 {
    public static void main(String[] args) {
        
        char ul = (char)(65 + Math.random() * 10000 % 26);
        System.out.println("The random letter is: " + ul);
        if (ul < 65 || ul >90)
            System.out.println("Program error - Calll the developer - 0895989221");
            
    }
}
