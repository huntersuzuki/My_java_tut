import java.util.*;
class StaticMethod {

    static String college;

    static void initialize(String collegeName){
        college = collegeName;
    }
    void display(){
        System.out.println("The college name is: "+college);
    }

    public static void main(String[] args) {
        String s;
        StaticMethod sm = new StaticMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name: ");
        s=sc.nextLine();
        StaticMethod.initialize(s);
        sm.display();

    }
}
/*
 * Why public main method is declared as static?
 * =============================================
 * If main() method is declared as non-static method then in order to
 * run main() method JVM require object of the class.
 * This is dependency on the object to be created to call main() method.
 * In order to remove this dependecny and to call main() method without
 * object by JVM it is declared as static.
 */