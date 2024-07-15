import java.util.*;
class try_catch_finaly {
    public static void main(String[] args) {
        int a = 0, b = 0, c;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first value");
            a = sc.nextInt();
            System.out.println("Enter second value");
            b = sc.nextInt();
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero, please enter the values correctly.");
            c = 0;
            // System.out.println("Exception: "+e);
        } catch (InputMismatchException e) {
            System.out.println("The input cannot be a string, please enter a number.");
        }
        finally{
            System.out.println("Finally block is executed");
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
/* 
Hierarchy of Exceptions 
=======================
Throwable 
  |
   - Error 
   - Exception 
     |
      - IOException 
     |
      - SQLException 
     |
      - ClassNotFoundException 
     |
      - RuntimeException
*/