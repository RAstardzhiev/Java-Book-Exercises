package Chapter_4;

public class CheckPoint_4_5 {
    public static void main(String[] args) {
        
        int random = (int)(34 + Math.random() * 100 % 22);
        System.out.println(random <= 55 && random >= 34 ?"Random number between 34 and 55: " + random : "Wrong program. Call the developer");
    }
    
}
