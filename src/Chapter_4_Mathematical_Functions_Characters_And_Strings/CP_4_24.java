package Chapter_4;
public class CP_4_24 {
    public static void main(String[] args) {
        System.out.printf("(a) amount is %f %e\n", 32.32, 32.32);
        System.out.printf("\t(a.1) amount is %10.2f\n", 32.325);
        
        //Wrong Spelling
        // System.out.printf("(b) amount is %5.2%% %5.4e\n", 32.327, 32.32);
        System.out.printf("(b) amount is %%5.2 * %1.2f\n", 32.327);
        System.out.printf("(c) %6b%6b\n", 1 > 2, 1 < 2);
        System.out.printf("(d) %6s\n", "Java");
        
        System.out.printf("(e) & (f) -->\n");
        System.out.printf("%-6b%s\n", 1>2, "Java");
        System.out.printf("%-6b%s\n", 1<2, "Java");
        System.out.printf("%6b%s\n", 1<2, "Java");
        
        
    }
    
}
