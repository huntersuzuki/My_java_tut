import java.util.*;
class SummationForLoop {
    public static void main(String[] args) {
        int n,i,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for summation: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            s=s+i;
            System.out.print(i+" + ");
        }
        System.out.println(" = "+s);
    }
}
/*
 * i=1 n=5
 * s=s+i
 * s=0+1=1
 * s=1+2=3
 * s=3+3=6
 * s=6+4=10
 * s=10+5=15
 */