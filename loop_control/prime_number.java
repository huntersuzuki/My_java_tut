import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if its prime or not: ");
        n=sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                System.out.println("It's non-prime number");
                break;
            }
            
        }
        System.out.println("value of i="+i);
        if(i==n){
            System.out.println("It's a prime number");
        }
    }
}
