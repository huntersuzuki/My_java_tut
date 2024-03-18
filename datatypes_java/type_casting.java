class Casting{
    public static void main(String args[]){
        //byte x = 125;
        //int y = x;
       
        //In above conversion there is no need to mention datatype explicitly to convert.
        //Coversion is done automatically during compiling.This process is called as Type conversion.
        //This process is called as Type conversion.


        //int x = 122;
        //byte y = x
        //byte y = (byte)x;

        //int x = 25;
        //double y = x; // type conversion
        
        double x = 28.76;
        //int y = x; => error
        int y = (int) x;
        System.out.print(y);

    }
}