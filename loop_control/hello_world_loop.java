package loop_control;
import java.util.*;
class HelloWorldLoop {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired number");
        n = sc.nextInt();
        i = 1;
        while(i<=n){
            System.out.println("Hello World");
            i++;
        }
    }
}
