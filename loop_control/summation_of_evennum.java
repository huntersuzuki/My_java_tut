import java.util.*;
class SummationEvenNum {
    public static void main(String[] args) {
        int sum = 0, i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for odd Summation");
        n = sc.nextInt();
        i = 2;
        while (i <= n) {
            sum = sum + i;
            System.out.println("i= " + i + " sum= " + sum);
            i = i + 2;
        }
        System.out.println(sum);
    }
}
