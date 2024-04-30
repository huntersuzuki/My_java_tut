
import java.util.*;
class CharacterToAscii {
    public static void main(String[] args) {
        int ascii_value;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chracter");
        str=sc.next();
        ch=str.charAt(0);
        ascii_value=ch;
        System.out.println("Ascii value of "+ch+" = "+ascii_value);
    }    
}
