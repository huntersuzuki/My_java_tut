
class A {
    void show(){
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Hi......");

        }
    }
}
class B{
    void show(){
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Hello......");

        }
    }
}
class M{
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
    
        a.show();
        b.show();
    }
}