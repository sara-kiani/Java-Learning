package ir.javacup.ShopSystem;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        } else {
            System.out.println("Not enough stock.");
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", stock=" + stock + "}";
    }
}

interface Discountable {
    double applyDiscount(double price);
}

class Customer {
    private String name;
    private ArrayList<Product> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Cart for " + name + ":");
        for (Product product : cart) {
            System.out.println(product);
        }
        System.out.println("Total: " + calculateTotal());
    }
}

class Order {
    private Customer customer;
    private ArrayList<Product> items;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addItem(Product product) {
        items.add(product);
        totalPrice += product.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void displayOrder() {
        System.out.println("Order for " + customer.getName() + ":");
        for (Product item : items) {
            System.out.println(item);
        }
        System.out.println("Total: " + totalPrice);
    }
}

public class ShopSystem {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000, 5);
        Product mouse = new Product("Mouse", 50, 10);

        Customer customer = new Customer("Alice");
        customer.addToCart(laptop);
        customer.addToCart(mouse);
        customer.displayCart();

        Order order = new Order(customer);
        order.addItem(laptop);
        order.addItem(mouse);
        order.displayOrder();
    }
}