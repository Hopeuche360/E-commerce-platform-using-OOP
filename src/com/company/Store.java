package com.company;

public class Store {
    private Buyer buyer;
    private Seller seller;
    private Product product;

    public Store(Buyer buyer, Seller seller, Product product) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
