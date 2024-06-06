import java.util.*;
class DiagonalAdditon {
    public static void main(String[] args) {
        int i,j,r,c,sum=0;
        int mat[][] = new int[30][30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row order for matrix");
        r=sc.nextInt();
        System.out.println("Enter the Column order for matrix");
        c=sc.nextInt();

        if(!(r>0 && c>0)){
            System.out.println("The order of matrix must be positive and non-zero");
        }
        else if(!(r==c)){
            System.out.println("Square matrix is needed for diagonal addition");
        }

        else{
            //User Input of matrix
            System.out.println("Enter matrix element");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    mat[i][j]=sc.nextInt();
                }
            }

            //Addition of matrix
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    if(i==j){
                        sum=sum+mat[i][j];
                    }
                }
            }

            //Display of user defined matrix

            System.out.println("MATRIX: ");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

            //Display of Diagonal addition result

            System.out.println("The Diagonal element Addition Result is : "+sum);

        }
    }
}
