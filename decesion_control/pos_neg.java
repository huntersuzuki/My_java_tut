import java.util.*;

class PosNeg {
    public static void main(String args[]) {
        int userNumChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        userNumChoice = sc.nextInt();

        if (userNumChoice == 0) {
            System.out.println(userNumChoice + " is neither positive nor negative");
        } else {
            if (userNumChoice > 0) {
                System.out.println(userNumChoice + " is Positive");
            } else {
                System.out.println(userNumChoice + " is Negative");
            }
        }
        /*
         * if(n>0){
         * System.out.println(+n+" is Positive");
         * }
         * else{
         * System.out.println(+n+" is Negative");
         * }
         */
    }
}