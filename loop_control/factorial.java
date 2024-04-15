/*
 * n=4
 * i i<=4 fact=fact*i i++
 * 1 1<=4 T fact=1*1=1 2
 * 2 2<=4 T fact=1*2=2 3
 * 3 3<=4 T fact=2*3=6 4
 * 4 4<=4 T fact=6*4=24 5
 * 5 5<=4 F.
 * 
 */
/*
 * n=5!
 * 
 * fact=5*4*3*2*1=120
 * 
 * n=5!
 * fact= 1 * 2 * 3 * 4 * 5
 * -----
 * 2 * 3
 * -------
 * 6 * 4
 * -------
 * 24 * 5
 * ---------
 * 120
 * Process getting repeated = multiply and store
 * n=4!
 * import java.util.*;
 * class FactorialNumber {
 * public static void main(String args[]){
 * int fact=1,i=1,n;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number to find it's factorial");
 * n = sc.nextInt();
 * while(i<=n){
 * fact=fact*i;
 * i++;
 * System.out.println("i= "+i+" fact= "+fact);
 * }
 * System.out.println(n+"!= "+fact);
 * }
 * }
 * /*
 * n=4
 * i i<=4 fact=fact*i i++
 * 1 1<=4 T fact=1*1=1 2
 * 2 2<=4 T fact=1*2=2 3
 * 3 3<=4 T fact=2*3=6 4
 * 4 4<=4 T fact=6*4=24 5
 * 5 5<=4 F.
 * 
 */
