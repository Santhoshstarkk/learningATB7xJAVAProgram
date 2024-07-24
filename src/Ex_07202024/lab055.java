package Ex_07202024;

import java.util.Scanner;

public class lab055 {
    public static void main(String[] args) {
        int side1 =4;
        int side2=4;
        int side3=4;

        if(side1==side2 && side2==side3){
            System.out.println("It is a equi triangle");
        } else if (side1==side2||side2==side3) {
            System.out.println("It is isoceles triangle");
        } else {
            System.out.println("Scalene");

        }


    }
}
