/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyProduct;

import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class ProductDirectory {
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(String name, String code, int avail, int price){
        Product product = new Product();
        product.setDrug(name);
        product.setDrugCode(code);
        product.setAvailability(avail);
        product.setPrice(price);
        productList.add(product);
        return product;
    }
}
