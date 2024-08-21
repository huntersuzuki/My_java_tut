
/*
A value entered by a user write a program to check whether value is present
in the array defined.
x[]={100,23,24,56,78,90,12,19}
 */
import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        int x[]={100,23,24,56,78,90,12,19},uinp,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be searched");
        uinp=sc.nextInt();
        for(int i:x){
            if (i==uinp) {
                //System.out.println("Number is Found!!!!");
                flag=1;
                break;
            }
        }
        System.out.println("The Flag variable Value: "+flag);
        if (flag==1) {
            System.out.println("Number is Found :)");
        }
        else{
            System.out.println("Number is Not Found :(");
        }
    }
}//CODE END
