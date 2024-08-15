package Ex_07202724;

import java.util.Scanner;

public class lab093 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of salaries");
      int salary = sc.nextInt();

        float[] salaries = new float[salary];

        System.out.println("enter the salaries:");
        for ( int i=0;i<salary;i++){
            salaries[i]=sc.nextFloat();

        } float max = salaries[0];
        float min = salaries[0];

        // Loop through the array to find the maximum and minimum salary
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
            if (salaries[i] < min) {
                min = salaries[i];
            }
        }

        // Print the maximum and minimum salary
        System.out.println("Max salary is: " + max + " LPA");
        System.out.println("Min salary is: " + min + " LPA");

        // Close the scanner
        sc.close();
    }
}




