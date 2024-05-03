import java.util.*;
class CharacterPattern3 {
    public static void main(String[] args) {
        int i, j, k, n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        n = sc.nextInt();
        k = 65;
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                ch = (char) k;
                System.out.print(ch + " ");
                k++;
            }
            System.out.println();
        }
    }
}
/*
    A               65
    B C             66 67 
    D E F   ====>   68 69 70
    G H I J         71 72 73 74
 */