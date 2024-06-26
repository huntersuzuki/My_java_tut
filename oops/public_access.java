class PublicAccess {
    public int x;

    void getData(){
        x=20;
        displayData();
    }
    void displayData(){
        System.out.println("Value of x in getdata method: "+x);
    }
}
class PublicAccessMain{
    public static void main(String[] args) {
        PublicAccess pa = new PublicAccess();
        pa.getData();
        // pa.displayData();
        pa.x=100;
        System.out.println("The value of x in main method outside it's original class is: "+pa.x);
    }
}
/*
 * Four pillars of OOPS
 * 1) Abstraction
 * 2) Encapsulation
 * 3) Inheritance
 * 4) Polymorphism
 * 
 * Encapsulation
 * =============
 * The method to hide the data in a single unit is called as Encapsulation.
 * class contains data members and Methods.
 * Encapsulation provide security to data members and methods to be accessed
 * withing certain scope.
 * Encapsulation is implemented by access_specifers in Java.
 */
/*
 * Access Specifier
 * ===============
 * Access specifier defined the scope to access the data members and methods of
 * the
 * class by the object.
 * There are 4 types of Access Spcifier.
 * 1) default access specifier
 * 2) public access specifier.
 * 3) private access specifer.
 * 4) protected access specifier.
 */