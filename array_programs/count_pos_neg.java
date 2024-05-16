/*
Count the number of positive and negative elements in the array.

x[]={10,-3,-4,67,-9,11,14,-5}
 */
class CountPosNegEle {
    public static void main(String[] args) {
        int x[] = { 10, -3, -4, 67, -9, 11, 14, -5, 0 }, poscount = 0, negcount = 0;
        for (int i : x) {
            if (i == 0) {
                continue;
            } else if (i > 0) {
                poscount++;
            } else {
                negcount++;
            }

        }
        System.out.println("Total number of elements "+x.length);
        System.out.println("The total positive number are " + poscount);
        System.out.println("The total negative number are " + negcount);

    }
}
