import itemcategory.Clothing;

public class Main {
    public static void main(String[] args) {

        // creating a object from clothing class
        Clothing myShirt = new Clothing();

        //setting the fields
        myShirt.setCategoryName("Clothing");
        myShirt.setPrice(150.40);
        myShirt.setQuantity(2);
        myShirt.setProductId(987614986);
        myShirt.setProductName("Shirt");
        myShirt.setStoreName("Jet");

        //calling the methods
        myShirt.productDescription();
        System.out.println("Amount due: R" + myShirt.calculateAmount());
    }
}