/*
     A radius is entered by user, WAP to find 
     1) area of circle.
     2) circumference of a circle.

     area of circle = 3.14*r*r;
     Circumference  = 2*3.14*r
 */
import java.util.*;
class CircleAreaCircumference{
    public static void main(String args[]){
        double r,aoc,circumference;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Circle Radius : ");
        r = sc.nextDouble();
        aoc = 3.14*r*r;
        circumference = 2*3.14*r;
        System.out.println("Circle Radius is : "+r);
        System.out.println("Area of circle is : "+aoc);
        System.out.println("Circumference of circle is : "+circumference);
    }
}