/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class OrderDirectory {
    private ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order o) {
        orderList.add(o);
    }

    public void deleteOrder(String orderID) {
        orderList.removeIf(o -> o.getOrderID().equals(orderID));
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
}
