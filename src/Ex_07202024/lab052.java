package Ex_07202024;

import java.util.Scanner;

public class lab052 {
    public static void main(String[] args) {
        Scanner cl=new Scanner(System.in);
        System.out.println("Enter no 1");
        int given_input= cl.nextInt();

        System.out.println("Enter no 2");
        int user_input=cl.nextInt();

        if (given_input%2==0 && user_input%2==0) {
            System.out.println("Both are even");
        } else if (given_input %2!=0 && user_input %2!=0) {
            System.out.println("Both are odd");
        } else if (given_input%2==0) {
            System.out.println("First no is even and second is odd");
        }else {
            System.out.println("Second is even and first is odd");
        }

    }

    }




