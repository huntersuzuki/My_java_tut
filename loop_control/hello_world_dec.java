package loop_control;
import java.util.*;
class HelloWorldDec {
    public static void main(String args[]){
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired number");
        n = sc.nextInt();
        i = n;
        while (i > 0) {
            System.out.println("Hello World");
            i--;
        }
    }
}
