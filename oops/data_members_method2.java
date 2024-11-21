import java.util.*;
class UniversityData {
    String name;
    int rollNo;
    double percentage;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Roll no: ");
        this.rollNo = sc.nextInt();
        System.out.println("Enter Percentage");
        this.percentage = sc.nextDouble();
    }

    void displayData() {
        System.out.println("Student Information");
        System.out.println("Name: " + this.name);
        System.out.println("Roll no: " + this.rollNo);
        System.out.println("Percentage: " + this.percentage);
    }
}

class MainClass1{
    
    public static void main(String[] args) {
        UniversityData ud = new UniversityData();
        UniversityData ud1 = new UniversityData();
        ud.getData();
        ud1.getData();
        ud.displayData();
        ud1.displayData();
    }
}
