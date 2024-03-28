import java.util.*;

class EvenOdd{
    public static void main(String args[]){
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        userInput = sc.nextInt();
        //process = userInput%2;

        if(userInput %2 != 0){
            System.out.println(userInput+" is odd");
        }
        else{
            System.out.println(userInput+" is even");
        }
    }
}