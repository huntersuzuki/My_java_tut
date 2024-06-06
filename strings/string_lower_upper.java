import java.util.*;
class StringLowerUpper {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s1=sc.nextLine();
        s2=s1.toLowerCase();
        System.out.println("The new string is: "+s2);
    }
}
