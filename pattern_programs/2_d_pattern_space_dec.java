/*
n=5
|* * * * *         i=5   j=1,2,3,4,5   s=0     k=1 Nothing
|  * * * *         i=4   j=1,2,3,4     s=2     k=1,2
|    * * *         i=3   j=1,2,3       s=4     k=1,2,3,4
|      * *         i=2   j=1,2         s=6     k=1,2,3,4,5,6
|        *         i=1   j=1           s=8     k=1,2,3,4,5,6,7,8
|
n=4
|* * * *           i=4   j=1,2,3,4     s=0     k=1 Nothing
|  * * *           i=3   j=1,2,3       s=2     k=1,2
|    * *           i=2   j=1,2         s=4     k=1,2,3,4
|      *           i=1
*/
import java.util.*;
class PatternSpaceDec {
    public static void main(String[] args) {
        int i,j,n,k,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        s=0;
        for(i=n;i>0;i--){
            for(k=1;k<=s;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            s+=2;
        }
    }
}
