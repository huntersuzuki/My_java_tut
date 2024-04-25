/*

n=6754

For summation of digit first we must get the digit separated.
For digit separation use modulus operator.

count=0
sum=0
1st iteration             2nd iteration      3rd iteration     4th iteration     n=0 stop
n=6754                    n=675              n=67              n=6
x=n%10 => 6754%10=4       x=675%10=5         x=67%10=7         x=6%10=6
sum=sum+x=> 0+4=4         sum=sum+5=4+5=9    sum=sum+7=9+7=16  sum=sum+6=16+6=22
count++ => 1              count++=> 2        count++=>3

*/

import java.util.*;
class SummationCountDigits {
    public static void main(String[] args) {
        int n,i,count=0,sum=0,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n!=0){
            x=n%10;
            sum=sum+x;
            count++;
            n=n/10;
        }
        System.out.println("Total number of digits is: "+count);
        System.out.println("The summation is: "+sum);
    }
}
