/*
   Write a program to calculate simple interest.
   si=p*n*r/100
   where 
   p= principle amount 
   n= number of year or tenure or period
   r= rate of interest.

   p=10000
   n=2
   r=10% 

   si=(10000*2*10)/100 = 2000 interest for 2 years.
 */
import java.util.*;
class SimpleInterest{
    public static void main(String args[]){
        double p,n,r,interest,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        p = sc.nextDouble();
        System.out.println("Enter Duration in years : ");
        n = sc.nextDouble();
        System.out.println("Enter Rate of Interest : ");
        r = sc.nextDouble();

        interest = (p*n*r)/100;
        amount = p + interest;

        System.out.println("Principal Amount : "+" Rs "+p);
        System.out.println("Duration : " +n+ " Years");
        System.out.println("Total Amount :"+" Rs " +amount); 
    }
}