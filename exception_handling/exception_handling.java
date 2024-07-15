import java.util.*;

class ExceptionHandling {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        a = sc.nextInt();
        System.out.println("Enter second value");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Addition is: " + c);
        try{

            c = a / b;
        }
        catch(ArithmeticException e){
            // System.out.println("Denominator cannot be zero, please enter the values correctly.");
            c=0;
            System.out.println("Exception: "+e);
        }
        System.out.println("Division is: " + c);
        c = a - b;
        System.out.println("Subtraction is: " + c);
        c = a * b;
        System.out.println("Multiplication is: " + c);
    }
}
