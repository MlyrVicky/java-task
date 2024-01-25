package guvi.assessment.guvi.task.task3.o2;

public class Product implements Taxable {
    private int productId;
    private double price;
    private int quantity;

    public Product(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double unitPriceOfProduct = price * quantity * salesTax;
        System.out.println("productId : " + productId + "\n" + "price : " + price + "\n" + "quantity : " + quantity + "\n" + "productTax  : " + unitPriceOfProduct);
        System.out.println("\n");
    }
}
