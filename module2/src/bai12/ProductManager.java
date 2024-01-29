package bai12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> productList;
    public ProductManager(List<Product> productList){
        this.productList = productList;
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void updateProduct(int id, String newName, double newPrice){
        for (Product product:
                productList) {
            if (product.getId() == id){
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }
    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }
    public void displayProducts() {
        for (Product product:
                productList) {
            System.out.println(product);
        }
    }
    public Product searchProductByName(String name) {
        for (Product product:
                productList) {
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public void sortProductsAscending() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
    }
    public void sortProductsDescending(){
        Collections.sort(productList,Comparator.comparing(Product::getPrice).reversed());
    }
}