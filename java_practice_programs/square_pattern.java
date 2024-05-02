import java.util.*;
class SquarePattern {
    public static void main(String[] args) {
        int i,j,n,k,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        s=2*(n-1);
        for(i=1;i<=n;i++){
            for(k=1;k<=s;k++){
                System.out.print("* ");
            }
            for(j=i;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
 *  i=1 n=5 s=8 
 *  i   i<=n    k   k<=s    k++     j=i   j<=i    j++     i++        
 *  1   1<=5 T  1   1<=8 T   2
 *              2   2<=8 T   3
 *              3   3<=8 T   4
 *              .
 *              .
 *              .
 *              .
 *              8   8<=8 T    9
 *              9   9<=8 F           1    1<=1 T    2
 *                                   2    2<=1 F             2
 *  2  2<=5 T   k inititialize 
 *                  again            2    2<=2 T    3
 *                                   3    3<=3 F             3
 *  3  3<=5 T   k initialize 
 *                  again            3    3<=3 T    4
 *                                   4    4<=3 F             4
 *  4  4<=5 T   k initialize
 *                  again            4    4<=4 T    5
 *                                   5    5<=4 F             5
 *  5  5<=5 T   k initialize 
 *                  again            5    5<=5 T    6
 *                                   6    6<=5 F             6
 *  6  6<=5 F i loop completed
 */             

 /*
  *                   o/p
  *             *_*_*_*_*_*_*_*_*_
                *_*_*_*_*_*_*_*_*_
                *_*_*_*_*_*_*_*_*_
                *_*_*_*_*_*_*_*_*_
                *_*_*_*_*_*_*_*_*_
  */