package Ex_07202024;

import java.util.Scanner;

public class lab057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find today's date");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("No idea what day it is");
                break;
        }
        System.out.println("Outside the loop");
    }
}