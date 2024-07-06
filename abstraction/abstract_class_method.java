
abstract class Animal{
    abstract void sound();
}

class Tiger extends Animal{
    void sound(){
        System.out.println("The tiger roars loudly!!!!!!");
    }
}
class Lion extends Animal{
    void sound() {
        System.out.println("The lion roars!!!!!!");
    }
}

class MainAnimal {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Lion l1 = new Lion();

        t1.sound();
        l1.sound();
    }
}
