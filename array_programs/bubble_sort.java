/*
            
                                       x
                             0   1   2   3   4   5   

                             45   6  90  13  100  32
    x[0]>x[1]=>swap          6   45  90  13  100  32
    x[1]>x[2]=> no swap      6   45  90  13  100  32
    x[2]>x[3]=>swap          6   45  13  90  100  32
    x[3]>x[4]=>no swap       6   45  13  90  100  32
    x[4]>x[5]=>swap          6   45  13  90  32   100

    =================================================
    x[0]>x[1]=
x[0]>x[1]=> No swap      6   45  13  90  32   100
    x[1]>x[2]=> Swap         6   13  45  90  32   100
    x[2]>x[3]=> No Swap      6   13  45  90  32   100
    x[3]>x[4]=> Swap         6   13  45  32  90   100
    x[4]>x[5]=> No Swap      6   13  45  32  90   100
    =================================================
x[0]>x[1]=> No swap      6   13  45  32  90   100
    x[1]>x[2]=> No swap      6   13  45  32  90   100
    x[2]>x[3]=> Swap         6   13  32  45  90   100
    x[3]>x[4]=> no swap      6   13  32  45  90   100
    x[4]>x[5]=> no swap      6   13  32  45  90   100
*/  
class BubbleSort {
    public static void main(String[] args) {
        int x[]={45,6,90,13,100,32},i,j,temp;
        for(i=0;i<x.length;i++){
            for(j=0;j<x.length-1;j++){
                if(x[j]>x[j+1])//Accending sorting
                // (x[j]<x[j+1])//Deccending sorting
                {
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array In Acending Order:");
        for (int k : x) {
            System.out.print(k+" ");
        }
    }
}
