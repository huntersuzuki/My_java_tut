import java.util.*;
class OddPattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print a pattern");
        n=sc.nextInt();
        for(i=1;i<=n;i+=2){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
