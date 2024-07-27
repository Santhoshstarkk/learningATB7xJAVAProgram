package labassigments;

import java.util.Scanner;

public class Triangleclassifer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value1");
        int Side1 =sc.nextInt();

        System.out.println("Enter the value2");
        int Side2 =sc.nextInt();

        System.out.println("Enter the value3");
        int Side3 =sc.nextInt();


        if (Side1==Side2 && Side2==Side3){
            System.out.println("This is a equi triangle");
        } else if (Side1==Side2|| Side2==Side3) {
            System.out.println("This is Isosceles");

        } else {
            System.out.println("This is Scalene");
        }

    }
}


