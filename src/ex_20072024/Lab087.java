package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number!");
        int num = sc.nextInt();


        if(num> 0 ){
            System.out.println("Positive Number");
        }else if( num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }




    }
}