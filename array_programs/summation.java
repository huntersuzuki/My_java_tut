/*
   Summation of all array elements.

   int x[]={1,5,6,10,2,3};
            0 1 2 3  4 5
   sum=0;

   sum=sum+x[0]; sum=sum+1=1
   sum=sum+x[1]; sum=sum+5=6
   .
   .
   sum=sum+x[5];
 */
class ArraySummation {
    public static void main(String args[]) {
        int arr[]={1,5,6,10,2,3},sum=0,i;
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Summation is = "+sum);
    }    
}
