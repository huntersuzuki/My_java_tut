/*
Multilevel Inheritance:
Single inheritance when extended further in multiple levels is called as Multilevel Inheritance.

                       A   Base class
                       |
                       |
                       |
                       B  Intermediate Base Class
                       |
                       |
                       |
                       C  Intermediate Base Class
                       .
                       .
                       .
                       D Derived class
*/
class ParentMulti{
    int a;
    void getDataA(int x){
        a = x;
    }
}
class FirstChild extends ParentMulti{
    int b;
    void getDataB(int y){
        b = y;
    }
}
class SecondChild extends FirstChild{
    int total;
    void total(){
        total = a+b;
        System.out.println("The First Value is: "+a);
        System.out.println("The Second Value is: "+b);
        System.out.println("The Total sum of the values is: "+total);
    }
}

class MainMulti {
    public static void main(String[] args) {
        SecondChild sc = new SecondChild();
        sc.getDataA(20);
        sc.getDataB(40);
        sc.total();
    }
}
