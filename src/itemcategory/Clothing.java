package itemcategory;

import onlinestore.Category;
import onlinestore.CategoryMethod;

public class Clothing extends Category {

    @Override
    public double calculateAmount() {
        return getPrice()*getQuantity();
    }

    @Override
    public void productDescription() {
        System.out.println("Category name: " +getCategoryName());
        System.out.println("Product name: " +getProductName());
        System.out.println("Product ID: " +getProductId());
        System.out.println("Store name: " +getStoreName());
        System.out.println("Product price: " +getPrice());
    }



}
