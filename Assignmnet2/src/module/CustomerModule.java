/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;
import model.Customer;
import model.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class CustomerModule {
    private CustomerDirectory customerDirectory;

    public CustomerModule(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void addCustomer(Customer c) {
        customerDirectory.addCustomer(c);
    }

    public Customer searchCustomerByID(String id) {
        return customerDirectory.searchCustomerByID(id);
    }

    public ArrayList<Customer> searchCustomerByName(String name) {
        return customerDirectory.searchCustomerByName(name);
    }

    public void deleteCustomer(String id) {
        customerDirectory.deleteCustomer(id);
    }

    public ArrayList<Customer> getAllCustomers() {
        return customerDirectory.getCustomerList();
    }
    
}
