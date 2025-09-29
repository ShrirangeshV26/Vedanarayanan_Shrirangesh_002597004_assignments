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
public class ProductCatalog {
    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void updateProduct(String productID, Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductID().equals(productID)) {
                productList.set(i, updatedProduct);
                return;
            }
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    
}
