import java.util.*;
class FactorialNumber {
    public static void main(String args[]){
        int fact=1,i=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        n = sc.nextInt();
        while(i<=n){
            fact=fact*i;
            i++;
            System.out.println("i= "+i+" fact= "+fact);
        }
        System.out.println(n+"!= "+fact);
    }
}
