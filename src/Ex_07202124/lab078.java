package Ex_07202124;

import java.util.Scanner;

public class lab078 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //scan.nextLine();


        scan.close();
        System.out.println("String:" +s);
        System.out.println("Double:"+d);
        System.out.println("int:"+i);
    }
}
