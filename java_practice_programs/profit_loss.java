import java.util.*;
class ProfitLoss{
    public static void main(String[] args) {
        double profit,loss,sellingPrice,costPrice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your product selling price");
        sellingPrice = sc.nextDouble();
        System.out.println("Enter your product cost price");
        costPrice = sc.nextDouble();
        profit = sellingPrice-costPrice;
        loss = costPrice-sellingPrice;
        System.out.println(profit+" Is the profit made on the Item "+loss+" Is the loss incured from the Item");
    }
}
