interface Run{
    void greet();
}
interface Walk{
    void greet();
}

class MainAmbiguityRemoval implements Run,Walk{

    public void greet(){
        System.out.println("Removed ambiguity from multiple inheritance using interface");
    }
    public static void main(String[] args) {
        MainAmbiguityRemoval mar = new MainAmbiguityRemoval();
        mar.greet();
    }
}
