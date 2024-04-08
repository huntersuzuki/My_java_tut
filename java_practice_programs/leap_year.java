import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year ");
        year = sc.nextInt();
        if(year%4 != 0){
            System.out.println(year+" Is not a leap year");
        }
        else{
            System.out.println(year+" It's a leap year");
        }
    }
}
