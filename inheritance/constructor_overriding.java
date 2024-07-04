class AparentClass{
    int a;
    AparentClass(){
        a=100;
    }
    void displayA(){
        System.out.println("Value of a: "+a);
    }
}

class BchildClass extends AparentClass{
    int b;
    BchildClass(){
        b=159;
    }
    void displayB(){
        System.out.println("Value of b: "+b);
    }
}



class MainConstrOverriding {
    public static void main(String[] args) {
        BchildClass bc = new BchildClass();
        bc.displayA();
        bc.displayB();
    }
}
