import java.util.Scanner;

public class it24103822lab3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityInKg = scanner.nextDouble();

        double totalCost = pricePerKg * quantityInKg;

        System.out.println("The amount you have to pay: " + totalCost);
        
        scanner.close();
    }
}
