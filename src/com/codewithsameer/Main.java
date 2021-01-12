//First Java program. Started to learn Java. Very easy if you know C++.
package com.codewithsameer;
//Java packages: biggest advantage of Java. I'm working on Java 15. Java 17 is a long time support from Oracle
//planned for 2021.
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*//Variables in Java
        //Primitive Types : 8 types: byte, short, int, long, float, double, Char and bool.
        int age = 35;
        System.out.println("Hi there");
        System.out.println(age);

        //Reference types are more complex types. They are objects of type Class. E.g., String class, Date class
        //Point class and so on. When we include these reference classes IntelliJ automatically imports the
        //associated package.
        Date now = new Date();
        System.out.println(now);

        //Pointers in Java
        int x =1, y=1;
        Point point1 = new Point(x,y);
        Point point2 = point1; //point1 and point2 are pointing to same address now.
        point1.x = 2;
        point2.y = 10;
        System.out.println(point2);

        //Strings in Java
        String message = "hello" + " there";
        //System.out.println(message.endsWith("re"));
        System.out.println(message.toUpperCase(Locale.ROOT));
        //String class has all these functions which you can use at your convenience!!!
        String message2 = "GoodMorning!!";
        System.out.println(message2.replace("!!",  "**"));
        //Demonstrate that String objects are immutable or cannot be changed.
        System.out.println(message2);

        //Arrays in Java
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3;
        System.out.println(Arrays.toString(numbers));

        //Other way to Initialize an array
        int [] numbers2 = {3, 4, 6, 1, 2};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        Arrays.parallelSort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //Multidimensional Arrays
        //int [][] multi = {{1,2,3},{4,5, 6}};
        int [][][] multi = new int [2][2][2];
        multi[0][0][0] = 4;
        System.out.println(Arrays.deepToString(multi));

        //Constants
        final float pi = 3.14f;
        System.out.println(pi);

        //Type casting
        String k = "1.1";
        double l = Double.parseDouble(k) + 2;
        System.out.println(l);

        //Math Class
        System.out.println(Math.min(5,10));
        double m = (int) (Math.random()*100);
        System.out.println(m);

        //Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String cur = currency.format(123456.789);
        System.out.println(cur);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(0.1));

        //Accept input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine().trim();
        System.out.println("your name is : " + name);*/

        //Calculate monthly mortgage payments
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        long principal = in.nextLong();
        System.out.print("Enter Interest rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter number of Payments: ");
        double payments = in.nextLong();

        double monthlyPayments = principal * (  (rate * Math.pow((1+rate), payments)) / (Math.pow((1+rate), payments) - 1) );
        String paymentDollars = NumberFormat.getCurrencyInstance().format(monthlyPayments);
        System.out.print("Monthly payments that needs to be done is : " + paymentDollars);*/

        // Conditional statements, logical and comparison statements
        //int income = 80000;
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the income: ");
        try {
            long inputIncome = input.nextLong();
            //boolean hasHighIncome = inputIncome > 100_000;
            //System.out.println(hasHighIncome);
            //Ternary operator
            String className = inputIncome > 100_000 ? "First" : "Second" ;
            System.out.println(className);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input " + e.getMessage());
        }*/

        // Loops in Java
        // For loop
        // Useful when we know how many times to repeat
        /*for (int i =5;  i>=1; i--){
            System.out.println("hello " + i);
        }*/
        // While loop
        // Are useful when we don't know how many times to repeat.
        /*String input = "";
        Scanner in = new Scanner(System.in);
        while (!input.equals("stop")){
            System.out.println("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        }*/
        // Same thing with do while loop
        // Here the loop gets executed atleast once even if condition is false
        /*String input = "";
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("stop"));*/

        // Break and continue statements in while loop.
        /*String input = "";
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Input: ");
            input = in.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }*/

        //for each loop. This is always a forward only loop. You cannot iterate backwards.
        String [] fruits = {"apple", "orange", "mango"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }


        System.out.println("EOF");
    }
}
