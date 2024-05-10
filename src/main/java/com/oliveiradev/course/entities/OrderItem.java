package com.oliveiradev.course.entities;

public class OrderItem {
    private Long quantity;
    private Double price;

    public OrderItem() {
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal(double price) {
        return quantity * price;
    }
}
