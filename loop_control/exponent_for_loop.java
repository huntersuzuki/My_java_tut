import java.util.*;
class ExponentForLoop {
    public static void main(String args[]){
        int n,p,i,res=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        System.out.print("Enter the power for the number: ");
        p=sc.nextInt();
        if(p>=0 && n>=0){
            for (i = 1; i <= p; i++) {
                res = res * n;
            }
            System.out.println(n+"^"+p+"="+res);
        }
        else{
            System.out.println("Enter a valid number power");
        }
        
        
    }
}
/*
 * res=1 n=2 p=3
 * res = 1*2 =2
 * res = 2*2 =4
 * res = 4*2 =8
 */