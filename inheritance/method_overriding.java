/*
If a base class has a method defined and a child class also contains same method
name as that of base class, object of child class will always invoke the method defined
in the child class, it will not invoke the method defined in the base class.
So method defined in the child class override the method(it does allow the base class
method to execute) defined in the base class, this is called as method overriding.
*/

class Aoverriding{
    void greet(){
        System.out.println("Greeting from Aoverriding method");
    }
}

class Boverriding extends Aoverriding{
    void greet(){
        super.greet(); // it will access the base of the child class
        System.out.println("Greetin from Boverriding method");
    }
}

class MainOverriding {
    public static void main(String[] args) {
        Boverriding bo = new Boverriding();
        bo.greet();
    }
}
