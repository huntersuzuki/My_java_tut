import java.util.*;
class NumberPattern4 {
    public static void main(String[] args) {
        int i, j, k, n, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        s = 0;
        for (i = n; i > 0; i--) {
            for (k = 1; k <= s; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            s += 2;
        }
    }
}
