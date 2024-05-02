import java.util.*;

class DiamondPattern {
    public static void main(String[] args) {
        int i, j, k, l, s, n, s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        s = 2 * (n - 1);
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= s; k++) {
                System.out.print(" ");
            }
            s--;
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
        s1 = s+2;
        for (l = n - 1; l > 0; l--) {
            for (k = 1; k <= s1; k++) {
                System.out.print(" ");
            }
            s1++;
            for (j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
        *
       * *
      * * *
     * * * *
      * * *
       * *
        * 
 */