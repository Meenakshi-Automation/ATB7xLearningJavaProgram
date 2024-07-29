package ex_20072024;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if it's a vowel or not");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("It's a consonent");
        }
    }
}
