/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;
import model.CustomerDirectory;
import model.ProductCatalog;
import model.OrderDirectory;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class DataManager {
    private CustomerDirectory customerDirectory;
    private ProductCatalog productCatalog;
    private OrderDirectory orderDirectory;

    public DataManager() {
        this.customerDirectory = new CustomerDirectory();
        this.productCatalog = new ProductCatalog();
        this.orderDirectory = new OrderDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }
    
    
}
