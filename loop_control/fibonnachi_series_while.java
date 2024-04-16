/*
             s->s->s->s
       0  1  1  2  3  5  8  13 ...... 
1      i  j
2         i  j
3            i  j
4               i  j
5                  i  j


i=0,j=1          i=1,j=1          i=1 j=2         i=2 j=3
   s=i+j=0+1=1      s=i+j=1+1=2      s=i+j=1+2=3     s=i+j=2+3=5
   print s          print s          print s         print s
   i=j=1            i=j=1            i=j=2           i=j=3
   j=s=1            j=s=2            j=s=3           j=s=5

 */
import java.util.*;
class FibonnachiSeries {
    public static void main(String args[]) {
        int n,i,j,s,k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range for fibinacchi series");
        n=sc.nextInt();
        i=0;
        j=1;
        System.out.print(i + " " + j + " ");
        while (k<=n-2) {
            s=i+j;
            System.out.print(s+" ");
            i=j;
            j=s;
            k++;
        }
    }
}
/*
 * n=6 i=0,j=1 output: 0 1 1 2 3 5
 * k k<=4 s=i+j i=j j=s k++
 * 1 1<=4 T s=0+1=1 i=1 j=1 2
 * 2 2<=4 T s=1+1=2 i=1 j=2 3
 * 3 3<=4 T s=1+2=3 i=2 j=3 4
 * 4 4<=4 T s=2+3=5 i=3 j=5 5
 * 5 5<=4 F
 */
