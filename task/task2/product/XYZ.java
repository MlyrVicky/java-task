package guvi.assessment.guvi.task.task2.product;


import java.util.*;

public class XYZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Product[] p = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " +(i + 1));
            System.out.print("Enter PID: ");
            int pid = s.nextInt();
            System.out.print("Enter Price: ");
            double price = s.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = s.nextInt();

            p[i] = new Product(pid, price, quantity);
        }

        int maxPriceIndex = findMaxPriceProductIndex(p);
        System.out.println("Product with the highest price has PID: " + p[maxPriceIndex].pid);

        double totalAmountSpent = calculateTotalAmountSpent(p);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

    }

    private static int findMaxPriceProductIndex(Product[] products) {
        int maxPriceIndex = 0;
        double maxPrice = products[0].price;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPriceIndex = i;
            }
        }

        return maxPriceIndex;
    }

    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }

        return totalAmount;

    }
}