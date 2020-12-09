package com.Reto1.Reto1.Model;

public class OrderProduct {
    private int idOrderProduct;
    private int idProduct;
    private int idOrder;
    private int quantity;

    public OrderProduct() {
    }

    public OrderProduct(int idOrderProduct, int idProduct, int idOrder, int quantity) {
        this.idOrderProduct = idOrderProduct;
        this.idProduct = idProduct;
        this.idOrder = idOrder;
        this.quantity = quantity;
    }

    public int getIdOrderProduct() {
        return idOrderProduct;
    }

    public void setIdOrderProduct(int idOrderProduct) {
        this.idOrderProduct = idOrderProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
