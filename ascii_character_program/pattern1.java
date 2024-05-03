import java.util.*;
class CharacterPattern1 {
    public static void main(String[] args) {
        int av=65,i,j,n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                ch=(char)av;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
