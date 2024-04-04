import java.util.*;
class FiveDigitNumber {
    public static void main(String[] args) {
        int userNumber , result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        userNumber = sc.nextInt();
        result = userNumber+10000+1000+100+10+1;
        System.out.println("The new number is : "+result);
    }
}
