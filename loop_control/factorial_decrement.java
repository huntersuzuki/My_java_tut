import java.util.*;
class FactorialDecrement {
    public static void main(String[] args) {
        int fact = 1, i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        n = sc.nextInt();
        i=n;
        while (i > 0) {
            fact = fact * i;
            i--;
            System.out.println("i= " + i + " fact= " + fact);
        }
        System.out.println(n + "!= " + fact);
    }
}
