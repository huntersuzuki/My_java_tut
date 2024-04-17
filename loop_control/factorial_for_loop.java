import java.util.*;
class FactorialForLoop {
    public static void main(String args[]){
        int n,fact=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial of: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
            System.out.print(i);
            System.out.print("*");
        }
        System.out.println(" = "+fact);
    }
}
/* n=5
 * fact =1 i=1
 *        f        i
 * fact = 1   *    1 =1
 * fact = 1   *    2 =2 
 * fact = 2   *    3 =6
 * fact = 6   *    4 =24
 * fact = 24  *    5 =120
 */