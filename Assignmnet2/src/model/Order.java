/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class Order {
    private String orderID;
    private LocalDateTime orderDateTime;
    private String orderType;
    private String paymentMethod;
    private String orderStatus;
    private Product product;

    public Order(String orderID, LocalDateTime orderDateTime, String orderType, String paymentMethod, String orderStatus, Product product) {
        this.orderID = orderID;
        this.orderDateTime = orderDateTime;
        this.orderType = orderType;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.product = product;
    }

    public String getOrderID() { return orderID; }
    public void setOrderID(String orderID) { this.orderID = orderID; }
    public LocalDateTime getOrderDateTime() { return orderDateTime; }
    public void setOrderDateTime(LocalDateTime orderDateTime) { this.orderDateTime = orderDateTime; }
    public String getOrderType() { return orderType; }
    public void setOrderType(String orderType) { this.orderType = orderType; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    
    
}
