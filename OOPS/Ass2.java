package OOPS;

class Product {
    int prodId, quantity;
    float price;
    static float totalPrice = 0;

    Product(int prodId, int quantity, float price) {
        this.prodId = prodId;
        this.quantity = quantity;
        this.price = price;
        totalPrice += quantity * price;
    }

    void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total for this product: " + (quantity * price));
        System.out.println("------------------------------");
    }
}

public class Ass2 {
    public static void main(String[] args) {
        Product p1 = new Product(101, 2, 50.0f);
        Product p2 = new Product(102, 1, 100.0f);
        Product p3 = new Product(103, 5, 20.0f);
        Product p4 = new Product(104, 3, 15.0f);
        Product p5 = new Product(105, 4, 30.0f);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Total Price for all products: " + Product.totalPrice);

    }
}
