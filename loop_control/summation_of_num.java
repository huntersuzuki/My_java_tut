/*
     Summation of 1 to n

     n=5
     result=1+2+3+4+5=15

     n=4
     1+2+3+4
     sum=0
     sum=sum+1 => sum=0+1=1
     sum=sum+2 => sum=1+2=3  ====> sum=sum+i } i take value from 1 to 4
     sum=sum+3 => sum=3+3=6
     sum=sum+4 => sum=4+6=10
    
     n=5
     1+2+3+4+5
     sum=0
     sum=sum+1 => sum=0+1=1
     sum=sum+2 => sum=1+2=3  ====> sum=sum+i } i take value from 1 to 5
     sum=sum+3 => sum=3+3=6
     sum=sum+4 => sum=4+6=10
     sum=sum+5 => sum=10+5=15
 */
import java.util.*;
class SummationOfNum {
    public static void main(String[] args) {
        int sum=0,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for it's summation");
        n = sc.nextInt();
        i=1;
        while(i<=n){
            sum=sum+i;
            System.out.println("i= "+i+" sum= "+sum);
            i++;
        }
        System.out.println("The summation of "+n+" is "+sum);
    }
}

/*
 * n=4
 * i i<=4 sum=sum+i i++
 * 1 1<=4 T sum=0+1=1 2
 * 2 2<=4 T sum=1+2=3 3
 * 3 3<=4 T sum=3+3=6 4
 * 4 4<=4 T sum=6+4=10 5
 * 5 5<=4 F
 * 
 */