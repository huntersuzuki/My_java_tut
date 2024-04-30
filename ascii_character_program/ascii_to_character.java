import java.util.*;
class AsciiToCharacter {
    public static void main(String[] args) {
        int ascii_value;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ascii value");
        ascii_value = sc.nextInt();
        if(ascii_value>=0 && ascii_value<=255){

            ch = (char)ascii_value;
            System.out.println("Character for Ascii value " + ascii_value + " = " + ch);
        }
        else{
            System.out.println("Enter values between 0-255");
        }
    }
}
