class CountEvenNum {
    public static void main(String[] args) {
        int x[]={11,2,10,5,88,90,45,66,78,23},count=0;
        for (int i : x) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The Even Count is = "+count);
    }
}
