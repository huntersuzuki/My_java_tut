import java.util.*;
class StringMatch {
    public static void main(String[] args) {
        String s1,s2;
        // boolean res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        s1=sc.nextLine();
        System.out.println("Enter second string");
        s2=sc.nextLine();
        
        // res=s1.equals(s2);
        if (!(s1.toLowerCase().equals(s2.toLowerCase()))) {
            System.out.println("Strings do not match");
        }
        else{
            System.out.println("Strings match");
        }
    }
}
