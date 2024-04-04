import java.util.*;

class CostOfItem {
    public static void main(String[] args) {
        double totalPrice , totalProfit , result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total price of the product");
        totalPrice = sc.nextDouble();
        System.out.println("Enter total profit earned");
        totalProfit = sc.nextDouble();
        result = Math.round(totalPrice/totalProfit);
        System.out.println("Price of each item is "+result);
    }
}
