import java.util.*;
class FloydsTriangle {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
