/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class Customer {
  


    private String customerID;
    private String firstName;
    private String lastName;
    private String contact;

    public Customer(String customerID, String firstName, String lastName, String contact) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

  
    public String getCustomerID() { return customerID; }
    public void setCustomerID(String customerID) { this.customerID = customerID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + customerID + ")";
    }
}

    

