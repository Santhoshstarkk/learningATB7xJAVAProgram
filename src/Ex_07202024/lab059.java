package Ex_07202024;

import java.util.Scanner;

public class lab059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLS ENTER A LETTER");
        char  ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
        }
             switch (ch){
        case 'a','e','i','o','u':
            System.out.println("vowels");
            break;
            }


        }

    }

