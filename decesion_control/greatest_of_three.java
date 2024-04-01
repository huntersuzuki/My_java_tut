import java.util.*;

class GreatestOfThree {
    public static void main(String args[]) {
        float x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number x ");
        x = sc.nextFloat();
        System.out.println("Enter Second Number y ");
        y = sc.nextFloat();
        System.out.println("Enter Third Number z ");
        z = sc.nextFloat();

        if (x > y) {
            if (x > z) {
                System.out.println(x + " is Greater");
            } else {
                System.out.println(z + " is Greater");
            }
        } else {
            if (y > z) {
                System.out.println(y + " is Greater");
            } else {
                System.out.println(z + " is Greater");
            }
        }
    }
}
