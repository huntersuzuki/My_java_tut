 import java.util.*;
 class StringPalindrome {
    public static void main(String[] args) {
        String org,rev="";
        int i;
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        org=sc.nextLine();
        org=org.toLowerCase();
        for(i=org.length()-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        result=org.equals(rev);
        if (result) {
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
