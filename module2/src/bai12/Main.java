package bai12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productListArrayList = new ArrayList<>();
        ProductManager productManagerArrayList = new ProductManager(productListArrayList);

        List<Product> productListLinkedList = new LinkedList<>();
        ProductManager productManagerLinkedList = new ProductManager(productListLinkedList);

        testProductManager(productManagerArrayList);
        testProductManager(productManagerLinkedList);
    }

    public static void testProductManager(ProductManager productManager){
        productManager.addProduct(new Product(1,"Laptop",1200.0));
        productManager.addProduct(new Product(2,"Phone",800.0));
        productManager.addProduct(new Product(3,"Table",400.0));

        System.out.println("Product List: ");
        productManager.displayProducts();

        productManager.updateProduct(2,"NewPhone",900.0);
        System.out.println("\nProduct List after updating:");
        productManager.displayProducts();

        productManager.deleteProduct(1);
        System.out.println("\nProduct List after deleting");
        productManager.displayProducts();

        Product foundProduct = productManager.searchProductByName("Table");
        System.out.println("\nFound Product: " + (foundProduct != null ? foundProduct : "Not Found"));

        productManager.sortProductsAscending();
        System.out.println("\nProduct List after sorting ascending:");
        productManager.displayProducts();

        productManager.sortProductsDescending();
        System.out.println("\nProduct List after sorting descending: ");
        productManager.displayProducts();
    }
}