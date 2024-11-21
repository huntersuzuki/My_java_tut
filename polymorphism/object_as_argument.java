class Arithmatic1 {
    int a,b;
    Arithmatic1(int x, int y){
        a = x;
        b = y;
    }
    void getObject(Arithmatic1 obj1){
        System.out.println("Object received as an argument !!!!!!");
    }
}
class MainArithmatic{
    public static void main(String[] args) {
        Arithmatic1 a1 = new Arithmatic1(10, 20);
        Arithmatic1 a = new Arithmatic1(100, 200);
        a.getObject(a1);
    }
}