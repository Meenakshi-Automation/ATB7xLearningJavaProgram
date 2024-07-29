package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                break;
        }
    }
}
