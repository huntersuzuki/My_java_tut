import java.util.*;
class VowelConsonant {
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        str = sc.next();
        ch = str.charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It's a vowel");
        }
        else{
            System.out.println("It's a consonant");
        }
    }
}
