/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class BankAccount {
    private String personName;
    private String accountNumber;
    private String accountType;
    private String debitAmount;
    private String creditAmount;

    public BankAccount() {}

    public String getPersonName() { return personName; }
    public void setPersonName(String personName) { this.personName = personName; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public String getDebitAmount() { return debitAmount; }
    public void setDebitAmount(String debitAmount) { this.debitAmount = debitAmount; }

    public String getCreditAmount() { return creditAmount; }
    public void setCreditAmount(String creditAmount) { this.creditAmount = creditAmount; }
    
}
