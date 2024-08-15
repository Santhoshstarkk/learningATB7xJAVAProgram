package Ex_07202124;

public class lab079 {
    public static void main(String[] args) {
        boolean condition = true;  // Change this to false to see the difference

        if (condition) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Condition is false, so the loop will not execute.");
        }
    }
}