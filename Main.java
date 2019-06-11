package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        boolean isTrue = true;
        byte num;
        int bigNum;
        double doubNum;
        String myString = new String("Goodbuy");
        String myNewString = "Friend";

        doubNum = 123.12344d;
        bigNum = 1000;
        num = 12;

        if (isTrue) {
            bigNum += num;
            System.out.println(doubNum + bigNum + num);
            System.out.println(bigNum);

        }
        else if(!isTrue)
        {
            System.out.println("No!");
        }
        else {
            System.out.println("Yes");
        }

        System.out.println("Enter your string");
        Scanner str = new Scanner(System.in);
        System.out.println(str.nextLine()+ " my line.");

        System.out.println("Enter your number");
        Scanner number = new Scanner(System.in);

        int enterNum = number.nextInt();

        System.out.println(enterNum + " - my num.");
        System.out.println((bigNum + enterNum) + " - number + bigNum");

        Scanner numeration = new Scanner(System.in);
        float first, second, result;
        System.out.println("Enter first num: ");
        first = numeration.nextFloat();
        System.out.println("Enter second num: ");
        second = numeration.nextFloat();
        result = first + second;
        System.out.println(result);

        isTrue = result >= 0;
        if(isTrue)
        {
            System.out.println("result = " + result);
        }
        else{
            System.out.println("result < 0");
        }

        System.out.println("Enter new num: ");
        int newNum = number.nextInt();

        switch(newNum){
            case 0:
                System.out.println("newNum = 0");
                break;
            case 1:
                System.out.println("newNum = 1");
                break;
            default:
                System.out.println("Wrong newNum");
                break;
        }

        System.out.print(myString + " ");
        System.out.println(myNewString);
    }

}