import java.util.Scanner;

public class IT24103822Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityInKg = scanner.nextDouble();
        double totalCost = pricePerKg * quantityInKg;
        double discount = totalCost * 0.10;
        double finalAmount = totalCost - discount;

        System.out.println("Total cost before discount: " + totalCost);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay after discount: " + finalAmount);
        
        scanner.close();
    }
}
