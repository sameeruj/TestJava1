package com.codewithsameer;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int age = 35;
        System.out.println("Hi there");
        System.out.println(age);
        Date now = new Date();
        System.out.println(now);
        int x =1, y=1;
        Point point1 = new Point(x,y);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "hello" + " there";
        System.out.println(message.endsWith("re"));
        System.out.println(message.toUpperCase(Locale.ROOT));
        //String class has all these functions which you can use at your convinience!!!

        String message2 = "GoodMorning!!";
        System.out.println(message2.replace("!!",  "**"));
        //Demonstrate that String objects are immutable or cannot be changed.
        System.out.println(message2);
        System.out.println("EOF");
    }
}
