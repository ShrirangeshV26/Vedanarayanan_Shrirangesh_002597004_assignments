/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;
import model.Order;
import model.OrderDirectory;
import java.util.ArrayList;


/**
 *
 * @author vedanarayananshrirangesh
 */
public class OrderModule {
    private OrderDirectory orderDirectory;

    public OrderModule(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public void addOrder(Order o) {
        orderDirectory.addOrder(o);
    }

    public void deleteOrder(String orderID) {
        orderDirectory.deleteOrder(orderID);
    }

    public ArrayList<Order> getAllOrders() {
        return orderDirectory.getOrderList();
    }
    
}
