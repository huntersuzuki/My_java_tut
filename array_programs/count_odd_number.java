class CountOddNum {
    public static void main(String[] args) {
        int x[] = { 11, 2, 10, 5, 88, 90, 45, 66, 78, 23 }, oddcount = 0,evencount=0;
        for (int i : x) {
            if (i % 2 != 0) {
                oddcount++;
            }
            else{
                evencount++;
            }
        }
        System.out.println("The Odd Count is = " + oddcount);
        System.out.println("The Odd Count is = " + evencount);
    }
}
