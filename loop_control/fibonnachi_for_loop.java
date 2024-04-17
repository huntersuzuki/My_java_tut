import java.util.*;
class FibonnachiForLoop {
    public static void main(String args[]){
        int n,i,j,s,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range for Fibonnachi series");
        n = sc.nextInt();
        i=0;
        j=1;
        System.out.print(i+" "+j+" ");
        for(k=1;k<=n-2;k++){
            s=i+j;
            System.out.print(s+" ");
            i=j;
            j=s;
        }
    }    
}
