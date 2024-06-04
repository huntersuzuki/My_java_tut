import java.util.*;
class matrix_addition {
    public static void main(String[] args) {
        int r1,r2,c1,c2,i,j;
        int mat1[][]=new int[30][30];
        int mat2[][] = new int[30][30];
        int mat3[][] = new int[30][30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row for first matrix");
        r1=sc.nextInt();
        System.out.println("Enter the column of first matrix");
        c1=sc.nextInt();
        System.out.println("Enter the row of second matrix");
        r2=sc.nextInt();
        System.out.println("Enter the column of second matrix");
        c2=sc.nextInt();
        if (!(r1>0 && r2>0 && c1>0 && c2>0)) {
            System.out.println("Order must be positive and non-zero");
        }
        else if(!(r1==r2 && c1==c2)){
            System.out.println("Error: The matrix order is not same");
        }
        else{
            //Matrix 1 input
            System.out.println("Enter Element for first matrix");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }
            //Matrix 2 input
            System.out.println("Enter Element for second matrix");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            //Matrix addition
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    mat3[i][j] = mat1[i][j]+mat2[i][j];
                }
            }
            //Dsiplay Matrix 1
            System.out.println("MATRIX 1");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            //Display Matrix 2
            System.out.println("MATRIX 2");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }
            //Display Matrix 3
            System.out.println("MATRIX 3");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        }
    }    
}
