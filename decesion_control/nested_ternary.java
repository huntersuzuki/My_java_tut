import java.util.*;
class NestedTernary {
    public static void main(String[] args) {
        int x,y,z,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        System.out.println("Enter third number");
        z = sc.nextInt();
        res = x>y?(x>z?x:z):(y>z?y:z);
        System.out.println(res+" is greatest number");
    }
}
