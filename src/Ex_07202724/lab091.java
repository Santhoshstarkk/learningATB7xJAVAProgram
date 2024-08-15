package Ex_07202724;

import java.util.Scanner;

public class lab091 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long[] marks =new long[5];
         long sum=0;

        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter ur sub"+(i+1)+":");
            marks[i]= sc.nextInt();
              sum+=marks[i];

        } double  average=(double) sum/marks.length;
        System.out.println("your average is" +average);

        System.out.println("your marks are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();

    }
}
