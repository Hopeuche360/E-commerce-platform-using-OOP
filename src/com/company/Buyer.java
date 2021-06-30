package com.company;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
//    private List<Product> myList = new ArrayList<>();
    // TODO create an arraylist to hold the list of items of the buyer and call it cart. Remove the cart class
    private List<Product> buyerCart = new ArrayList<>();
    private  Cart cart;
//    private List<Product> checkOut = new ArrayList<>();



    public Buyer(String name, String username, String password, Cart cart) {
        super(name, username, password);
        this.cart = cart;
//        this.buyerCart = buyerCart;
    }
    void viewProduct() {
        for (Product product : buyerCart)
            System.out.println(product);
    }
    void viewProductByCategory(ProductCategory productCategory) {
        for (Product product : buyerCart) {
            if (product.getProductCategory().equals(productCategory)) {
                System.out.println(product);
            }
        }
    }
    public void selectItemToCart(Product product) {
         buyerCart.add(product);
    }
    public void removeItemFromCart(Product product) {
        buyerCart.remove(product);
    }
    public void viewItemsInCart() {
        for (Product Product : buyerCart) {
            System.out.println(Product);
        }
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "buyerCart=" + buyerCart +
                '}';
    }
}
