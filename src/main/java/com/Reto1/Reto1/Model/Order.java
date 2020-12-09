package com.Reto1.Reto1.Model;

public class Order {
    private int idOrder;
    private String date;
    private String nameUser;
    private String stage;

    public Order() {
    }

    public Order(int _idOrder, String _date, String _nameUser, String _stage) {
        this.idOrder = _idOrder;
        this.date = _date;
        this.nameUser = _nameUser;
        this.stage = _stage;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

}
