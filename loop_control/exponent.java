import java.util.*;
class ExponentNum {
    public static void main(String[] args) {
        int i=1,res=1,num,pow;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Enter the power: ");
        pow = sc.nextInt();

        if(pow>=0){
            while(i<=pow){
                res=res*num;
                i++;
            }
            System.out.println(num+"^"+pow+"="+res);
        }
        else{
            System.out.println("Enter a positive power!!!");
        }
    }
}
