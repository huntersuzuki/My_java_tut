class OddEleSummation{
    public static void main(String[] args) {
        int x[]={12,1,23,12,11,16,17,45},sum=0;
        for(int i:x){
            if (i%2!=0) {
                sum=sum+i;
            }

        }
        System.out.println("Summation is = "+sum);
    }
}