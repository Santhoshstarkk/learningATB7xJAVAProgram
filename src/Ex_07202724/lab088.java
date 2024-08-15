package Ex_07202724;

import java.util.Scanner;

public class lab088 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] numbers= new int[3]; //0,1,2
        System.out.println("Enter 3 number:");
        for (int i = 0; i < numbers.length; i++) {
            numbers [i]= sc.nextInt();
        }
        System.out.println("the no entered");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }


    }
}
