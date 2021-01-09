//First Java program. Started to learn Java. Very easy if you know C++.
package com.codewithsameer;
//Java packages. Biggest advantage of Java. I'm working on Java 15. Java 17 is long time support from Oracle
//Planned for 2021.
import java.awt.*;
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
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //Strings in Java
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
