import java.util.*;
class AccessStrLoop {
  public static void main(String[] args) {
    String str;
    Character ch;
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    str=sc.nextLine();
    for(i=0;i<str.length();i++){
        ch=str.charAt(i);
        System.out.println(ch);
    }
  }  
}
