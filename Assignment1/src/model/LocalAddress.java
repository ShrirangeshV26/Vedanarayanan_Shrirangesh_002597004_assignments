/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class LocalAddress {
    private String personName;
    private String streetName;
    private String unitNum;
    private String city;
    private String zipCode;

    public LocalAddress() {}

    public String getPersonName() { return personName; }
    public void setPersonName(String personName) { this.personName = personName; }

    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) { this.streetName = streetName; }

    public String getUnitNum() { return unitNum; }
    public void setUnitNum(String unitNum) { this.unitNum = unitNum; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    
}
