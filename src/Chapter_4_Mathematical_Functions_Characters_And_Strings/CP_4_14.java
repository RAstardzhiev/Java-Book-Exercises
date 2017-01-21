package Chapter_4;

public class CP_4_14 {
    public static void main(String[] args) {
        
        char leter = (char)((int)(97 + Math.random() * 10000 % 26));
        
    //    System.out.println("Random lower case leter; " + leter);
        System.out.println(Character.isLowerCase(leter) ?"Random lower case leter; " + leter : "Program ERROR --> Call the developer");
    }
    
}
