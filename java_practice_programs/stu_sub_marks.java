import java.util.*;

class StudentMarks {
    public static void main(String args[]){
        double sub1,sub2,sub3,sub4,sub5,aggrMarks,perMarks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks :");
        sub1 = sc.nextDouble();
        System.out.println("Enter second subject marks :");
        sub2 = sc.nextDouble();
        System.out.println("Enter third subject marks :");
        sub3 = sc.nextDouble();
        System.out.println("Enter fourth subject marks :");
        sub4 = sc.nextDouble();
        System.out.println("Enter fifth subject marks :");
        sub5 = sc.nextDouble();
        aggrMarks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Aggregate marks for "+sub1+" , "+sub2+" , "+sub3+" , "+sub4+" & "+sub5+" is "+aggrMarks);
        perMarks = aggrMarks/5;
        System.out.println("The percentage for the obtained marks is : "+perMarks);
    }
}
