/*
2-D: two nested loop 
i outer loop  => i value = number of stars in row.
j inner loop

    i=1   j=1             *
    i=2   j=1,2           * *
    i=3   j=1,2,3         * * *
    i=4   j=1,2,3,4       * * * *
    i=5   j=1,2,3,4,5     * * * * *
   
    i= 1 to 5 with increment of 1 
    j= 1 to i with increment of 1 

 */
import java.util.*;
class TwoDpattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
        *_
        *_*_
        *_*_*_
                                                                        
       i     i<=5    j=1   j<=i   print("* ")  j++    i++    
       1     1<=5 T  j=1   1<=1 T              2                          
                      =2   2<=1 F                     2
       2     2<=5 T  j=1   1<=2 T              2
                      =2   2<=2 T              3
                      =3   3<=2 F                     3
       3     3<=5 T  j=1   1<=3 T
*/