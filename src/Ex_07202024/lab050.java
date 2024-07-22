package Ex_07202024;

import java.util.Scanner;

public class lab050 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num1 ");
        int user_input =sc.nextInt();

        System.out.println("enter num2 ");
        int user_input2 =sc.nextInt();


        if(user_input%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");

            if (user_input2  %2==0) {
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }
        }
    }
