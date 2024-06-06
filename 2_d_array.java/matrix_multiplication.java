import java.util.*;
class MatrixMul {
    public static void main(String[] args) {
        int i,j,r1,r2,c1,c2,k;
        int mat1[][] = new int[30][30];
        int mat2[][] = new int[30][30];
        int mat3[][] = new int[30][30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for first matrix");
        r1=sc.nextInt();
        System.out.println("Enter number of column for first matrix");
        c1=sc.nextInt();
        System.out.println("Enter number of rows for second matrix");
        r2=sc.nextInt();
        System.out.println("Enter number of column for second matrix");
        c2=sc.nextInt();

        if (!(r1>0 && r2>0 && c1>0 && c2>0)) {
            System.out.println("The Elements of matrix must be non-zero and positive");
        }
        else if(!(r1==c2)){
            System.out.println("The order of column and rows of both matrix must be same");
        }
        else{
            //Taking input for first matrix
            System.out.println("Enter first matrix elements");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }
            //Taking input for second matrix
            System.out.println("Enter Second matrix elements");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    mat2[i][j]=sc.nextInt();
                }
            }
            //Matrix Multiplication
            /*       mat1        mat2
             *      1 2 3       8 9 5           8+12+9  9+12+6   5+10+3
             *      4 8 7       6 6 5   ===>   32+48+21 36+48+14 20+40+7
             *      5 5 6       3 2 1          40+30+18 45+30+12 25+25+6
             * 
             *         mat3
             *      29  27 18  
             *      101 98 67 
             *      88  87 56
             */

             for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    for(k=0;k<r1;k++){
                         mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
                    }
                }
             }
             //display of matrix multiplication
             System.out.println("MATRIX 1");
             for (i = 0; i < r2; i++) {
                 for (j = 0; j < c2; j++) {
                     System.out.print(mat1[i][j] + " ");
                 }
                 System.out.println();
             }
             System.out.println("MATRIX 2");
             for (i = 0; i < r2; i++) {
                 for (j = 0; j < c2; j++) {
                     System.out.print(mat2[i][j] + " ");
                 }
                 System.out.println();
             }
             System.out.println("MATRIX 3");
             for (i = 0; i < r2; i++) {
                 for (j = 0; j < c2; j++) {
                     System.out.print(mat3[i][j]+" ");
                 }
                 System.out.println();
             }
             
        }
    }
}
