import java.util.*;
interface GetA{
    void getA(double a);
}
interface GetB{
    void getB(double b);
}

class MainMultipleInheritance implements GetA,GetB {
    double x,y,z;
   public void getA(double a){
        x=a;
        System.out.println("X: "+x);
    }
   public void getB(double b){
        y=b;
        System.out.println("Z: " + y);
    }
    void displayRes(){
        z = x+y;
        System.out.println("The addition is: "+z);
    }
    public static void main(String[] args) {
        MainMultipleInheritance mml = new MainMultipleInheritance();
        double c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        c = sc.nextDouble();
        System.out.println("Enter second value");
        d = sc.nextDouble();
        mml.getA(c);
        mml.getB(d);
        mml.displayRes();
    }   
}
