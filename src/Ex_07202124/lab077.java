package Ex_07202124;

import java.util.Scanner;

public class lab077 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i =1 ;
        int fact=1;
        while (i<=n) {
            fact=fact*i;
            i++;

        }
        System.out.println("factorial of "+n+ "is:"+fact);
        sc.close();
    }
}
