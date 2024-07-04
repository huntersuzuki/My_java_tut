class Arithmatic {
    int a,b;
    Arithmatic(int x, int y){
        a = x;
        b = y;
    }
    void getObject(Arithmatic obj1){
        System.out.println("Object received as an argument !!!!!!");
    }
}
class MainArithmatic{
    public static void main(String[] args) {
        Arithmatic a1 = new Arithmatic(10, 20);
        Arithmatic a = new Arithmatic(100, 200);
        a.getObject(a1);
    }
}