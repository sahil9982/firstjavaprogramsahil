package com.company;
import java.util.Scanner;

public class CS_05_taking_inputfromtheuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First number");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter second number");
//        int num2 = sc.nextInt();
//
//        int total = num1 + num2;
//
//        System.out.println("The sum of these two number is: ");
//        System.out.println(total);

//        System.out.println("Enter number 1 ");
//        float num1 = sc.nextFloat();
//        System.out.println("Enter number 2 ");
//        float num2 = sc.nextFloat();
//        float total = num1 + num2;
//        System.out.println("The sum of two number: ");
//        System.out.println(total);

//        System.out.println("Enter text");
//        String text = sc.next();
//        System.out.println(text);

//        System.out.println("Enter text");
//        String text = sc.nextLine();
//        System.out.println(text);

//        System.out.println("enter anythings");
//        boolean bool = sc.hasNextInt();
//        System.out.println(bool);
//
//

        System.out.println("Enter Marks subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter Marks subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter Marks subject 3");
        int sub3 = sc.nextInt();
        System.out.println("Enter Marks subject 4");
        int sub4 = sc.nextInt();
        System.out.println("Enter Marks subject 5");
        int sub5 = sc.nextInt();

        float total = ((sub1 + sub2 + sub3 + sub4 + sub5)/500.0f)*100;
        System.out.println("Your percentage is: ");
        System.out.println(total);










    }
}
