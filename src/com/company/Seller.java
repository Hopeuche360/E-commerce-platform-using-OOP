package com.company;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User{
    private List<Product> productList = new ArrayList<>();
    public Seller(String name, String username, String password) {
        super(name, username, password);
//        this.productList = productList;
    }

    public void newProductList(Product product) {
        productList.add(product);
    }
    void deleteProduct(Product product) {
        productList.remove(product);
    }

    void viewProduct() {
        for (Product el : productList)
            System.out.println(el);
    }
    void viewProductByCategory(ProductCategory productCategory) {
        for (Product product : productList) {
            if (product.getProductCategory().equals(productCategory)) {
                System.out.println(product);
            }
        }
    }


    @Override
    public String toString() {
        return "Seller{" +
                "myList=" + productList +
                '}';
    }
//         TODO use for each loop  to print out the products in the array list



}
