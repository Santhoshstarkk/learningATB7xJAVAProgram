package Ex_07202024;

import java.util.Scanner;

public class lab054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int scr = sc.nextInt();
        char grade='S';

        if (scr >= 90 && scr <= 100) {
            grade = 'A';

        } else if (scr >= 80 && scr <= 89) {
            grade = 'B';
        } else if (scr >= 70 && scr <= 79) {
            grade = 'C';

        } else if (scr >= 60 && scr <= 69) {
            grade = 'D';

        } else if (scr >= 0 && scr <= 59) {
            grade = 'F';
        } else {
            System.out.println("invalid score ");
        }
        System.out.println("Your grade is"+grade);

        sc.close();
    }
}










