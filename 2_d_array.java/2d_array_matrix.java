import java.util.*;
class TwoDarrayMatrix {
    public static void main(String[] args) {
        int i,j,r=3,c=3;
        int x[][]=new int[r][c];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3x3 matrix element seperated with space: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                x[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(x[i][i]+" ");
            }
            System.out.println();
        }
        
    }
}
