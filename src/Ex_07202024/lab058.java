package Ex_07202024;

import java.util.Scanner;

public class lab058 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the browser name for excution to happen");
        String browsername = sc.next();
        browsername =browsername.toLowerCase();


        switch (browsername){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case  "edge":
                System.out.println("Starting edge");
                break;
            case "fire fox":
                System.out.println("Starting firefox");
                break;
            case "uc browser":
                System.out.println("Starting UC");
                break;


        }


    }
}
