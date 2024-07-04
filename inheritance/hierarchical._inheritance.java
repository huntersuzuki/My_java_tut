class Ahierarchical{
    int a;
    void getDataA(int x){
        a = x;
    }
}
class Bhierarchical extends Ahierarchical{
    int b,total;
    void getDataB(int y){
        b = y;
    }
    void total(){
        total = a+b;
        System.out.println("The first value is: "+a);
        System.out.println("The secong value is: "+b);
        System.out.println("The total is: "+total );
    }
}
class Chierarchical extends Ahierarchical{
    int c,total;
    void getDataC(int z){
        c = z;
    }
    void total(){
        total = a + c;
        System.out.println("The first value is: " + a);
        System.out.println("The secong value is: " + c);
        System.out.println("The total is: " + total);
    }
}

class MainHierarchical{
    public static void main(String[] args) {
        Bhierarchical bh = new Bhierarchical();
        bh.getDataA(20);
        bh.getDataB(30);
        bh.total();
        Chierarchical ch = new Chierarchical();
        ch.getDataA(30);
        ch.getDataC(50);
        ch.total();
    }    
}

/*
     Hierarchical Inheritance:
     ========================
     The inheritance in which there is one base class and multiple derived classes
     is called as Hierarchical Inheritance.

                         B
                         |
       ------------------------------------------
      |       |       |       |       |          |
      D1     D2      D3      D4      D5..........Dn 

                         A
                         |
            -------------------------------
            |                             |
            B                             C
    
    class A{
    
    }

    class B extends A {
    
    }

    class C extends A{
    
    }
*/