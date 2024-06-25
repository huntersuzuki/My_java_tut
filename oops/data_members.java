import java.util.*;
class StudentDataMembers {
    String name;
    int rollNo;
    double percentage;

    public static void main(String[] args) {
        StudentDataMembers sda = new StudentDataMembers();
        StudentDataMembers sda1 = new StudentDataMembers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        sda.name=sc.nextLine();
        System.out.println("Enter Roll no: ");
        sda.rollNo=sc.nextInt();
        System.out.println("Enter Percentage: ");
        sda.percentage=sc.nextDouble();
        System.out.println();
        System.out.println("Enter Student Name: ");
        sda1.name = sc.nextLine();
        System.out.println("Enter Roll no: ");
        sda1.rollNo = sc.nextInt();
        System.out.println("Enter Percentage: ");
        sda1.percentage = sc.nextDouble();
        System.out.println();
        System.out.println("Student Information");
        System.out.println("Name: "+sda.name);
        System.out.println("Roll no: "+sda.rollNo);
        System.out.println("Percentage: "+sda.percentage);
        System.out.println();
        System.out.println("Student Information");
        System.out.println("Name: " + sda1.name);
        System.out.println("Roll no: " + sda1.rollNo);
        System.out.println("Percentage: " + sda1.percentage);
        System.out.println();

    }
}
