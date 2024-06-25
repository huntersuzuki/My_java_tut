class MethodOverloading{
    void addition(int a,int b){
        System.out.println("Addition of two number is: "+(a+b));
    }
    void addition(String x,String y){
        System.out.println("The Concatination is: "+(x+y));
    }
    // void addition(int a,int b,int c){
    //     System.out.println("Addition of two number is: "+(a+b+c));
    // }
    // void addition(int a,int b,int c,int d){
    //     System.out.println("Addition of two number is: "+(a+b+c+d));
    // }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.addition(10, 20);
        mo.addition("Pranay", "Bhoir");
        // mo.addition(10, 20,30);
        // mo.addition(10, 20, 30, 40);
    }
}