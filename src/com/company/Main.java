package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Seller admin = new Seller("Dayo", "uncleD", "abraham");
        Buyer buyer = new Buyer("Hope", "Ony", "1234");
        Product product = new Product(00432, "Shoe", 12_568.99, ProductCategory.FOOTWEAR);
        Product product1 = new Product(00432, "Shoe", 12_568.99, ProductCategory.FOOTWEAR);
        Product product2 = new Product(00432, "Shoe", 12_568.99, ProductCategory.BAGS);
        admin.newProductList(product);
        admin.newProductList(product1);
        admin.newProductList(product2);
        admin.viewProductByCategory(ProductCategory.BAGS);
        admin.viewProduct();
        buyer.selectItemToCart(product2);
        buyer.selectItemToCart(product1);
        buyer.viewItemsInCart();



        System.out.println();
    }
}
