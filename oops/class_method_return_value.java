class ReturnValue {
    double addition (int a,int b) {
        double c;
        c= a+b;
        return c;
    }
    boolean temp(){
        return true;
    }
    public static void main(String args[]){
        double res;
        ReturnValue rv = new ReturnValue();
        res=rv.addition(10, 30);
        System.out.println("Addition is: "+res);

        boolean res1;
        res1=rv.temp();
        System.out.println("The result is: "+res1);
    }   
}
