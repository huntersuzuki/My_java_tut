
/*
  WAP to count the number of digits entered by User.
  It can be any digit number.
  count=0
  n=4562             n=456              n=45             n=4             n=0
  n=n/10 => 4562/10  n=n/10=456/10=45   n=n/10=45/10=4   n=n/10=4/10=0
  n=456              n=45               n=4              n=0
  count++            count++            count++          count++
            0
          -----
      10 |  4
          - 0
          =====
            4
*/
import java.util.*;
class DigitCounting {
    public static void main(String[] args) {
        int n,i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter multiple digits");
        n=sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("The total digits are: "+count);
    }
}
/*
 * 0
 * n    n!=0    n=n/10      count
 * 567 567!=0 T n=567/10=56 1
 * 56 56!=0 T n=56/10 =5 2
 * 5 5!=0 T n=5/10 =0 3
 * 0 0!=0 F
 * 
 */