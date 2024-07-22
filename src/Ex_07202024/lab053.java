package Ex_07202024;

import java.util.Scanner;

public class lab053 {
    public static void main(String[] args) {
        Scanner cls=new Scanner(System.in);
        System.out.println("Enter ur num1");
        double input1 = cls.nextDouble();

        System.out.println("Enter ur num2");
        double input2= cls.nextDouble();

        if (input1>input2){
            System.out.println("input1 is max");
        } else{
            System.out.println("input2 is max");
        }




    }
}
