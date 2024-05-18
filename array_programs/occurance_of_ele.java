import java.util.*;
class OccuranceOfElement {
    public static void main(String[] args) {
        int x[]={100,23,24,56,78,90,12,19,56,90,12,78,56,12,90,12,15},uinp,flag=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element to be searched in the array");
        uinp=sc.nextInt();
        for(int i:x){
            if(i==uinp){
                count++;
                flag=1;
            }
        }
        if (flag==1) {
            System.out.println("The occurance of element "+uinp+" is:"+count);
        }
        else{
            System.out.println("Number not Found :(");
        }
    }
}
