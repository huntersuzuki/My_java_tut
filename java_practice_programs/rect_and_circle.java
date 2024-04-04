import java.util.*;

class RectAndCircle {
    public static void main(String args[]){
        double lengthRect , breadthRect ,radiusCircle ,areaCircle ,cirCumCircle ,areaRect, perimeterRect;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length Of rectangle ");
        lengthRect = sc.nextDouble();
        System.out.println("Enter Breadth of rectangle ");
        breadthRect = sc.nextDouble();
        System.out.println("Enter radius of a circle");
        radiusCircle = sc.nextDouble();
        areaRect = lengthRect*breadthRect;
        perimeterRect = 2*(lengthRect+breadthRect);
        areaCircle = 3.14*radiusCircle*radiusCircle;
        cirCumCircle = 2*3.14*radiusCircle;
        System.out.println(areaRect+" is area of rectangle");
        System.out.println(perimeterRect+" is perimeter of rectangle");
        System.out.println(areaCircle + " is area of circle");
        System.out.println(cirCumCircle+" is the circumference of circle");

    }
}
