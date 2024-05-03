import java.util.*;
class CharacterPattern2 {
    public static void main(String[] args) {
        int i,j,k,n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            k=65;
            for(j=1;j<=i;j++){
                ch=(char)k;
                System.out.print(ch+" ");
                k++;
            }
            System.out.println();
        }
    }
}
