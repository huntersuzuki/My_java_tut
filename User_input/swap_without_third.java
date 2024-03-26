import java.util.*;

class SwapWithoutThird{
    public static void main(String args[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        x = sc.nextInt();
        System.out.println("Enter the Second Number");
        y=sc.nextInt();
        System.out.println("The values of variable before Swapping");
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);

        x = x+y;
        y = x-y;
        x = x-y;
         System.out.println("The values of variable after Swapping");
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
}