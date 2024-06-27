/*
What is single inheritance?
The inheritance in which there is only one base class and one derived class is called
as Single inheritance.

                     A  Parent Class or Base class
                     |
                     |
                     |
                     B  Child class or Derived class


 */
class ParentSingle {
    int a;
    void getDataA(int x){
        a = x;
    }
}
class ChildSingle extends ParentSingle{
    int b,total;
    void getDataB(int y){
        b = y;
    }
    void total(){
        total = a+b;
        System.out.println("The First Value is: "+a);
        System.out.println("The Second Value is: "+b);
        System.out.println("The sum of both Values is: "+total);
    }
}
class MainSingle{
    public static void main(String[] args) {
        ChildSingle cs = new ChildSingle();
        cs.getDataA(20);
        cs.getDataB(40);
        cs.total();
    }
}