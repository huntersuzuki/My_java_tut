
class Student{
    void greet(){
        System.out.println("Hello ,good evening!!!!!!!!!");
    }
}


class ClassMethods {
    public static void main(String[] args) {
        // to access the class outside main class into
        // main class function we need to create it's object
        Student s1 = new Student();
        s1.greet();
    }
}
