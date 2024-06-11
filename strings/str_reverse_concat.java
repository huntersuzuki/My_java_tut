import java.util.*;
class StrReverseCopy {
    public static void main(String[] args) {
        String s1, s2 = "";
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s1=sc.nextLine();
        for (i = s1.length()-1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Original String: " + s1);
        System.out.println("Reverse Copied String: " + s2);
    }
}
