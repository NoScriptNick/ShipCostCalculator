import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double itemCost;
        double shippingCost = 0;
        double totalCost = 0;

        //shipping cost
        System.out.println("Enter the price of your item: ");
        if (scan.hasNextDouble()) {
            itemCost = scan.nextDouble();
            shippingCost = itemCost * 0.02;
            totalCost = shippingCost + itemCost;
            if (itemCost >= 100) {
                System.out.println("SHIPPING IS FREE!!!!!!!!!!!YAY!!!!!!!!!");
            } else if (itemCost <= 0) {
                System.out.println("You have entered an invalid price!!!!!!");
            } else {
                System.out.println("Your shipping cost is $" + shippingCost + " and your total cost is $" + totalCost);
            }
        } else {
            System.out.println("You have entered an invalid price!!!!!!!");
        }
    }
}