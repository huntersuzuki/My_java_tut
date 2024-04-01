import java.util.*;

class GreatestOfTwo{
    public static void main(String args[]){
        float x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number ");
        x = sc.nextFloat();
        System.out.println("Enter Second number ");
        y = sc.nextFloat();

        if(x==y){
            System.out.println(x+" is equal to "+y);
        }
        else{
            if(x>y){
                System.out.println(x+" Greater than "+y);
            }
            else{
                System.out.println(y+" is Greater than "+x);
            }
        }
    }
}