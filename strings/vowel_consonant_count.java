import java.util.*;
class VowelConsonantCount {
    public static void main(String[] args) {
        String str;
        Character ch;
        int i ,vowelCount=0,ConsonantCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.nextLine();
        str=str.toLowerCase();
        for (i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowelCount++;
            }
            else{
                ConsonantCount++;
            }
        }
        System.out.println("The Total number of Vowels: "+vowelCount);
        System.out.println("The Total Number of Consonants: "+ ConsonantCount);
    }

}
