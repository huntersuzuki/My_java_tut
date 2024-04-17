import java.util.*;
class ArmstrongThreeDigit {
    public static void main(String args[]) {
        int n,sum,a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Three digit number: ");
        n = sc.nextInt();
        if (n>=100 && n<=999) {
            a = n % 10; // 153%10=3 => 3 is seperated
            b = n / 10; // 153/10=15 => 3 is not in the list as it got seperated.
            c = b % 10; // 15%10=5 => 5 got seperated
            d = b / 10; // 15/10=1 => 1 got seperated
            sum = a * a * a + c * c * c + d * d * d; 
            System.out.println("Summation of " + n + " is " + sum);
            if (n == sum) {
                System.out.println(n + " is Armstrong number");
            } else {
                System.out.println(n + " is not an Armstrong number");
            }
        }
        else{
            System.out.println("Please enter a valid 3 digit number");
        }
        
    } 
}
