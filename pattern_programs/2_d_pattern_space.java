import java.util.*;
class PatternSpace {
    public static void main(String args[]){
        int i,j,k,s,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        s=2*(n-1);
        for(i=1;i<=n;i++){
            for(k=1;k<=s;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            s-=2;
        }
    }    
}
