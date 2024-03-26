import java.util.*;

class Addition{
    public static void main(String args[]){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        x = sc.nextInt();
        System.out.println("The first is: "+x);
        System.out.println("Enter the Second Number");
        y=sc.nextInt();
        System.out.println("The second number is: "+y);
        z=x+y;
        System.out.println("The Addition of "+x+" & "+y+" is "+z);
    }
}