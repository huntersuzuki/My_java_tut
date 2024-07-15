import java.util.*;
class GeneralException {
    public static void main(String[] args) {
        int a = 0, b = 0, c;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first value");
            a = sc.nextInt();
            System.out.println("Enter second value");
            b = sc.nextInt();
            c = a / b;
        } catch (Exception e) {
            System.out.println("Denominator cannot be zero, please enter the values correctly.");
            c = 0;
            // System.out.println("Exception: "+e);
            System.out.println("Please enter a number value not a string");
        } 
        c = a + b;
        System.out.println("Addition is: " + c);
        System.out.println("Division is: " + c);
        c = a - b;
        System.out.println("Subtraction is: " + c);
        c = a * b;
        System.out.println("Multiplication is: " + c);
    }
}
