
/*
  n=5
|        *     i=1   j=1             s=8      k=1,2,3,4,5,6,7,8
|      * *     i=2   j=1,2           s=6      k=1,2,3,4,5,6
|    * * *     i=3   j=1,2,3         s=4      k=1,2,3,4
|  * * * *     i=4   j=1,2,3,4       s=2      k=1,2
|* * * * *     i=5   j=1,2,3,4,5     s=0      k=1 nothing
| n=4
|      *       i=1   j=1             s=6      k=1,2,3,4,5,6
|    * *       i=2   j=1,2           s=4      k=1,2,3,4
|  * * *       i=3   j=1,2,3         s=2      k=1,2
|* * * *       i=4   j=1,2,3,4       s=0      k=1 nothing
|
|n=5   s=8
|n=4   s=6
|n=x   s=2*n-2=2(n-1)
for(i=1;i<=n;i++)
  {
        space printing logic;

        star printing logic;

        next line;
  }
*/
import java.util.*;
class PatternSpace {
    public static void main(String args[]){
        int i,j,k,s,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        s=2*(n-1);
        for(i=1;i<=n;i++){
            for(k=1;k<=s;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            s-=2;
        }
    }    
}
