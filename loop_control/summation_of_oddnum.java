import java.util.*;
class SummationOfOddNum {
    public static void main(String[] args) {
        int sum=0,i,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number for odd Summation");
        n = sc.nextInt();
        i = 1;
        while(i<=n){
            sum=sum+i;
            System.out.println("i= " + i + " sum= " + sum);
            i=i+2;
        }
        System.out.println(sum);
    }
}
/*
    n=8
    i<=8     sum=sum+i    i=i+2
    1<=8  T  sum=0+1=1      3
    3<=8  T  sum=1+3=4      5
    5<=8  T  sum=4+5=9      7
    7<=8  T  sum=9+7=16     9
    9<=9  F
 */
