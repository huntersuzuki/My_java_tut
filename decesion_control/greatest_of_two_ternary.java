import java.util.*;

class GreatestOfTwoTernary {
    public static void main(String args[]){
        double x,y,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        x = sc.nextDouble();
        System.out.println("Enter Second Number");
        y = sc.nextDouble();

        res = x>y?x:y;
        System.out.println(res+" is Greater");
    }
}
