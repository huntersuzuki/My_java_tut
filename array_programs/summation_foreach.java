class SummationForEach {
    public static void main(String args[]){
        int arr[] = { 1, 5, 6, 10, 2, 3 }, sum = 0;
        for(int i:arr){
            sum=sum+i;
        }
        System.out.println("Summation is = "+sum);
    }
}
