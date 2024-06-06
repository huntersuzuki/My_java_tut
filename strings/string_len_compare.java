import java.util.*;
class StringLenCompare {
    public static void main(String[] args) {
        String s,s1;
        int n,n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        s=sc.nextLine();
        System.out.println("Enter second string");
        s1=sc.nextLine();

        n=s.length();
        n1=s1.length();

        if(!(n==n1)){
            System.out.println("Strings are not equal in length");
        }
        else{
            System.out.println("String "+s+" & " +s1+ " are equal in length");
        }
    }
}
