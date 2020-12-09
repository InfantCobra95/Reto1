package com.Reto1.Reto1.Model;

public class Product {
    private int idProduct;
    private String name;
    private int price;
    private String img;

    public Product() {
    }

    public Product(int _idProducto, String _name, int _price, String _img) {
        this.idProduct = _idProducto;
        this.name = _name;
        this.price = _price;
        this.img = _img;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int id) {
        this.idProduct = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
