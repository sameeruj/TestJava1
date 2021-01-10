//First Java program. Started to learn Java. Very easy if you know C++.
package com.codewithsameer;
//Java packages: biggest advantage of Java. I'm working on Java 15. Java 17 is a long time support from Oracle
//planned for 2021.
import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Variables in Java
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
        //String class has all these functions which you can use at your convinience!!!
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

        System.out.println("EOF");
    }
}
