/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;
import model.Product;
import model.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author vedanarayananshrirangesh
 */
public class ProductModule {
    private ProductCatalog productCatalog;

    public ProductModule(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public void addProduct(Product p) {
        productCatalog.addProduct(p);
    }

    public void updateProduct(String productID, Product updatedProduct) {
        productCatalog.updateProduct(productID, updatedProduct);
    }

    public ArrayList<Product> getAllProducts() {
        return productCatalog.getProductList();
    }
    
}
