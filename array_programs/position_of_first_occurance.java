import java.util.*;
class PositionOfFirstOccurance {
     public static void main(String[] args) {
        int x[]={100,23,24,56,78,90,12,19,56,90,12,78,56,12,90,12,15},uinp,flag=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element to be searched in the array");
        uinp=sc.nextInt();
        for(int i:x){
            count++;    
            if(i==uinp){
                flag=1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("The Position of First occurance of element "+uinp+" is: "+count+" position");
        }
        else{
            System.out.println("Number not Found :(");
        }
    }
}
