class StaticExample {
    static int count = 0;
    void display(){
        System.out.println("Value of count: "+count);
    }
    public static void main(String[] args) {
        StaticExample se = new StaticExample();
        StaticExample se1 = new StaticExample();
        se.display();
        se1.display();
        count++;
        se.display();
        se1.display();

    }
}
