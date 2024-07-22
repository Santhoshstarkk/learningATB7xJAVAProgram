package Ex_07142024;

public class lab044 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int min = a < b ? a : b; // Corrected to get the minimum value
        int max = a > b ? a : b; // Corrected to get the maximum value
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
