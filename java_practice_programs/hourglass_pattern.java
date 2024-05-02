import java.util.*;
class HourGlassPattern {
    public static void main(String[] args) {
        int i,j,k,s,n,s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        s=0;
        
        for(i=n;i>0;i--){
            for(k=1;k<=s;k++){
                System.out.print(" ");
            }
            s++;
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s1 = s - 2;
        for (i = 2; i <=n ; i++) {
            for (k = 1; k <= s1; k++) {
                System.out.print(" ");
            }
            s1--;
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
* * * * * 
 * * * *
  * * * 
   * * 
    *
   * *
  * * *
 * * * *
* * * * *  
*/