/*
    Syntax to declare array.

    datatype array_name[]={e1,e2,e3,....,en};

    e.g
    int x[]={10,20,30,40,-50,0};
             0   1  2  3  4  5
    
    Accessing Array Element 
    syntax:
    array_name[indexvalue];

    x[0]=10
    x[4]=-50
    x[7]= Error

*/
class ArrayBasic {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        int count;
        // int x[]={10,20.45,44.76,79,90}// error because double value cannot be converted to integer value.
                //      0  1     2     3  4
        // double x[]={10,20.45,44.76,79,90};// no error because integer value can be converted to double value.
        System.out.println("Element: "+x[0]);
        System.out.println("Element: "+x[4]);
        System.out.println("Element: "+x[3]);
        // System.out.println("Element: "+x[8]);
        count=x.length;
        System.out.println("The total number of elements are: "+count);
    }
}
