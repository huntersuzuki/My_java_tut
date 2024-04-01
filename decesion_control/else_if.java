import java.util.*;

class ElseIf{
    public static void main(String args[]){
        float x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number x ");
        x = sc.nextFloat();
        System.out.println("Enter Second Number y ");
        y = sc.nextFloat();
        System.out.println("Enter Third Number z ");
        z = sc.nextFloat();

        if (x > y && x > z) {
            System.out.println(x + " is Greater");
        }
        else if (y > x && y > z) {
            System.out.println(y + " is Greater");
        }
        else if (z > x && z > y) {
            System.out.println(z + " is Greater");
        }
        else {
            System.out.println("All are Equal");
        }
    }
}