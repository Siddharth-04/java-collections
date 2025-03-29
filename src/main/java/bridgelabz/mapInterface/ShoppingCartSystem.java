package bridgelabz.mapInterface;

import java.util.*;

class ShoppingCart {
    Map<String, Double> productPrices = new HashMap<>();
    Map<String, Integer> cart = new LinkedHashMap<>();
    Map<Double, String> sortedCart = new TreeMap<>();

    void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            sortedCart.put(productPrices.get(product), product);
        }
    }

    void displayCart() {
        System.out.println("Cart in order added: " + cart);
        System.out.println("Cart sorted by price: " + sortedCart);
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);

        cart.displayCart();
    }
}
//Cart in order added: {Apple=2, Banana=3, Orange=1}
//Cart sorted by price: {0.8=Banana, 1.2=Orange, 1.5=Apple}