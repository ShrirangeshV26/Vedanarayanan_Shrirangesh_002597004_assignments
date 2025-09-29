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
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    // Add a customer
    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    // Search customer by ID
    public Customer searchCustomerByID(String id) {
        for (Customer c : customerList) {
            if (c.getCustomerID().equals(id)) return c;
        }
        return null;
    }

    // Search customers by full name
    public ArrayList<Customer> searchCustomerByName(String name) {
        ArrayList<Customer> result = new ArrayList<>();
        for (Customer c : customerList) {
            String fullName = c.getFirstName() + " " + c.getLastName();
            if (fullName.equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        return result;
    }

    // Delete a customer by ID
    public void deleteCustomer(String id) {
        customerList.removeIf(c -> c.getCustomerID().equals(id));
    }

    // Get all customers
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
}
