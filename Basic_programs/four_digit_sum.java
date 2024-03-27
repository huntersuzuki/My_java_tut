/*
 A four digit number is entered by user.
 WAP to find 
 1) Summation of all digits
 2) reverse of that number.

for e.g 
number entered by user: 3567
summation of digits: 3+5+6+7=21
reverse of number: 7653
digit separation logic
======================
n=3567
a=n%10      a=3567%10=7
b=n/10      b=356/10=356
c=b%10      c=356%10=6
d=b/10      d=356/10=35
e=d%10      e=35%10=5
f=d/10      f=35/10=3

add digit 
sum=a+c+e+f
 */

import java.util.*;
class FourDigitSum{
    public static void main(String args[]){
        int a,b,c,d,e,f,n,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Four digit number : ");
        n = sc.nextInt();
        a = n%10;
        b = n/10;
        c = b%10;
        d = b/10;
        e = d%10;
        f = d/10;
        sum = a+c+e+f;
        System.out.println("The Sum of "+n+" is "+sum);

    }
}