package com.Reto1.Reto1.Model;

public class OrderProductInfo {
    private int idOrderProduct;
    private int idOrder;
    private String nameProduct;
    private int quantity;

    public OrderProductInfo() {
    }

    public OrderProductInfo(int _idOrderProduct, int _idOrder, String _nameProduct, int _quantity) {
        this.idOrderProduct = _idOrderProduct;
        this.idOrder = _idOrder;
        this.nameProduct = _nameProduct;
        this.quantity = _quantity;
    }

    public int getIdOrderProduct() {
        return idOrderProduct;
    }

    public void setIdOrderProduct(int idOrderProduct) {
        this.idOrderProduct = idOrderProduct;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
    
}
