interface Greet{
    void greetEveryone();
}


class MainGreet implements Greet {

    public void greetEveryone(){
        System.out.println("Hello everyone, We are learning JAVA interfaces");
    }
    void hello(){
        System.out.println("HEllo All");
    }
    public static void main(String[] args) {
        MainGreet mg = new MainGreet();
        mg.greetEveryone();
        mg.hello();
    }
}
