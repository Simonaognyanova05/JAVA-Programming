public class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void printInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + getTotalPrice());
    }
}