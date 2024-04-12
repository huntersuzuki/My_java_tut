
import java.util.*;

class TableProgLoop {
    public static void main(String args[]) {
        int i, n, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for table: ");
        n = sc.nextInt();
        i = 1;
        while (i <= 10) {
            res = n * i;
            System.out.println(n + " x " + i + " = " + res);
            i++;
        }
    }
}
