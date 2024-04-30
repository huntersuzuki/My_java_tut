import java.util.*;

class CheckCharacter {
    public static void main(String[] args) {
        int ascii_value;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ascii value");
        str=sc.next();
        ch=str.charAt(0);
        ascii_value=ch;
        if(ascii_value>=65 && ascii_value<=90 || ascii_value>=97 && ascii_value<=122){
            System.out.println(ascii_value+" is an Alphabet");
        }
        else if(ascii_value>=48 && ascii_value<=57){
            System.out.println(ascii_value+" is a Number");
        }
        else{
            System.out.println(ascii_value+" is a Special Character");
        }

       
    }
}
