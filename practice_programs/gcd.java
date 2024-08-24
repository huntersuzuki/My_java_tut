import java.util.*;
 class GCD {
     public static void main(String[] args) {
         int num1, num2, remainder, quotient;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter 1st number");
         num1 = sc.nextInt();
         System.out.println("Enter 2nd number");
         num2 = sc.nextInt();
         remainder = num2 % num1;
         quotient = num2 / num1;
         for (int i = 1; i < quotient; i++) {
             remainder = num1 % remainder;
             if (num1 % remainder == 0) {
                 break;
             }
         }
         int lcm = (num1*num2)/remainder;
         System.out.println("GCD = " + remainder);
         System.out.println("LCM = " + lcm);
     }
}
