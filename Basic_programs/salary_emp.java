
/*
   A basic salary is entered by user. DA is 30% of his basic salary, 
   HRA is 40% of his basic Salary. WAP to calculate the gross salary 
   of that employee.

   bs=10000
   da=30% of 10000 = 3000
   hra= 40% of 10000 = 4000
   gs=bs+da+hra
 */
import java.util.*;

class Salary {
  public static void main(String args[]) {
    float bs, da, hra, gs;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Basic Salary: ");
    bs = sc.nextFloat();
    da = (float) (0.3) * bs;
    hra = (float) (0.4) * bs;
    gs = bs + da + hra;
    System.out.println("The Basic Salary is : " + bs);
    System.out.println("The Diet Allownace is : " + da);
    System.out.println("The House Rent is : " + hra);
    System.out.println("The Gross Salary is : " + gs);
  }
}