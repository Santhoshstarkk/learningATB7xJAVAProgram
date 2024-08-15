package Ex_07202724;

import java.util.Scanner;

public class lab089 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int[] num = new int[3];
        System.out.println("Enter 3 number");

       for (int i = 0; i <num.length ; i++) {

           num[i]= sc.nextInt();

        }
        System.out.println("your number are");
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }

        }

    }

