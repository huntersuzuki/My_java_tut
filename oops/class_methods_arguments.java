class ClassMethodsArguments {
    
    void greet(double x,double y){
        double res = x+y;
        System.out.println("Value of X: "+x);
        System.out.println("Value of Y: "+y);
        System.out.println("The addition: "+res);
    }
    
    public static void main(String[] args) {
        ClassMethodsArguments c1 = new ClassMethodsArguments();
        c1.greet(20, 45);
    }
}
