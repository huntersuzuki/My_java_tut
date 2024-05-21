import java.util.*;
class OneDarray {
    public static void main(String args[]){
        int size=5;
        int x[] = new int[size],i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number speperated via space: ");
        for(i=0;i<size;i++){
            x[i]=sc.nextInt();
        }
        for(int j:x){
            System.out.print(j+" ");
        }
    }
}
