interface ParentInterface{
    void greet();
}
interface ChildInterface extends ParentInterface{
    void hello();
}

class MainClass implements ChildInterface {
    
    public void greet(){
        System.out.println("Hello form Parent Interface");
    } 
    public void hello(){
        System.out.println("Hello from child interface");
    }
    public static void main(String[] args) {
        MainClass m1 = new MainClass();
        m1.greet();
        m1.hello();
    }
}
