import java.util.*;

class CharacterPattern1 {
    public static void main(String[] args) {
        int av, i, j, n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.println("Enter an Ascii value between 0-255");
        av = sc.nextInt();
        if (av >= 0 && av <= 255) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    ch = (char) av;
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Please enter a valid Ascii value !!!");
        }

    }
}
