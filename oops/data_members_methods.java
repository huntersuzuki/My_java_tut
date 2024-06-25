import java.util.*;
class CollegeData {
    String name;
    int rollNo;
    double percentage;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        System.out.println("Enter Roll no: ");
        rollNo=sc.nextInt();
        System.out.println("Enter Percentage");
        percentage=sc.nextDouble();
    }
    void displayData(){
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Percentage: " + percentage);
    }
    public static void main(String[] args) {
        CollegeData cd = new CollegeData();
        CollegeData cd1 = new CollegeData();
        cd.getData();
        cd.displayData();
        cd1.getData();
        cd1.displayData();

    }
}
