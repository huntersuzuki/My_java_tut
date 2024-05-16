/*
Write a program to find maximum number from the integer array.

x[]={10,30,45,1,89,23,190,22,12}

max=x[0]
max=10
x[0]>max F    x[1]>max   x[2]>max  x[3]>max   x[4]>max x[5]>max F x[6]>max x[7]>max F x[8]>max  F
              max=x[1]   max=x[2]  No change  max=x[4] no change  max=x[6] no change  No Change
*/
class MaxArrayEle {
    public static void main(String[] args) {
        int x[] = { 34, 656, 3502, 10 }, max, min;
        max = x[0];
        min = x[0];
        for (int i : x) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        System.out.println("The greatest element is " + max);
        System.out.println("The Smallest element is " + min);

    }
}
/*
 * max=x[0] = 34
 * 
 * i        i>max       max=i
 * 34       34>34 F       -
 * 656      656>34 T    max=i max=656
 * 3502     3502>656 T  max=i max=3502
 * 10       10>3502 F     -
 * 
 * The greatest number in the array list is 3502
 */