/* 
    Prime numbers within given range by User

    User is going to enter last number in that range
    For e.g user enter last term as 30.
    So program must print all prime numbers from 2 to 30.

    last_term=20
    There will be an outer loop that will be provide a single number to be checked from given range.
    There will be inner loop that will check that number to be prime or not.
    If number is prime then print that number, if number if non-prime , break and take next number
*/
import java.util.*;
class PrimeNumRange {
    public static void main(String args[]){
        int i,j,last_term;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for range");
        last_term=sc.nextInt();
        System.out.println("Prime number from 1 to "+last_term+" :");
        for(i=2;i<=last_term;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }
}
/*
 * last_term=10
 * 
 * i i<=10     j    j<i         i%j==0          j++     i==j    print(i)    i++
 * 2 2<=10     2    2<2 F       - -                     2==2        2        3
 * 3 3<=10 T   2    2<3 T       3%2==0 F        3
 * 3 3<3 F                                             3==3 T       3        4
 * 4 4<=10 T   2    2<4 T       4%2|0==0 T     break   4==2F        -        5
 * 5 5<=10 T   2    2<5 T       5%2|1==0 F      3
 * 3 3<5 T
 * 4 4<5 T                      5%4|1==0 F      5
 * 5 5<5 F                                             5==5T         5        6      
 * 6 6<5 F
 */