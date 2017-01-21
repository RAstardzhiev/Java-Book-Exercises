package Chapter_7;
public class Ex_7_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);
        int key = (int)(Math.random() * 100);
        System.out.println("Key is " + key + "\n");
        
        long startTime = System.currentTimeMillis();
        System.out.print("Result of Linear Search: " + Methods.linearSearch(array, key) + " Obtained for ");
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.print(time + " Milliseconds\n\n");
        
        java.util.Arrays.sort(array);
        startTime = System.currentTimeMillis();
        System.out.print("Result of Linear Search: " + Methods.binarySearch(array, key) + " Obtained for ");
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.print(time + " Milliseconds\n");
    }
}
