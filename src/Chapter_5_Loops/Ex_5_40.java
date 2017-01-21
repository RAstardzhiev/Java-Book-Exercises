package Chapter_5;
public class Ex_5_40 {
    public static void main(String[] args) {
        
        int heads = 0, tails = 0;
        
        for(int i = 1; i <= 1000000; i++) {
            int throwTheCoin = (int)(Math.random() * 10 % 2);
            if (throwTheCoin == 0)
                heads++;
            else if (throwTheCoin == 1)
                tails++;
            else
                System.out.println("Program Error - Call the Suppord");
        }
        
        System.out.println("The result of a milion thows of the coin is:" + 
                "\n\t- " + heads + " Heads" +
                "\n\t- " + tails + " Tails");
        
    }
}
