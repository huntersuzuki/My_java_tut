import java.util.*;
class RombusPattern {
    public static void main(String[] args) {
        int i,j,k,n,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        s=0;
        for(i=1;i<=n;i++){
            for(k=1;k<=s;k++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
            s+=2;
        }
    }
}
