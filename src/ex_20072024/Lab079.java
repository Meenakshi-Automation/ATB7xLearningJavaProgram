package ex_20072024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student number");
        int score = sc.nextInt();

        char grade = 'F';
        if (score >=90 && score <=100) {
            grade = 'A';
        } else if (score >=80 && score <=89) {
            grade = 'B';
        } else if (score >=70 && score <=79) {
            grade = 'C';
        } else if (score >=60 && score <=69) {
            grade = 'D';
        } else if (score >=50 && score <= 59) {
            grade = 'E';
        }else {
            grade = 'F';
        }

            System.out.println("Your grade is  :" + grade);

        sc.close();

        }
    }

