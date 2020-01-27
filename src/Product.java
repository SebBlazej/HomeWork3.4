import javax.print.attribute.standard.MediaSize;

public class Product {
    final String NAME;
    final float PRICE;
    final String DESCRIPTION;
    final Category CATEGORY;

    Product(String name, float price, String description, Category category){
        NAME = name;
        PRICE = price;
        DESCRIPTION = description;
        CATEGORY = category;
    }

    Product(String name, float price, String description){
        NAME = name;
        PRICE = price;
        DESCRIPTION = description;
        CATEGORY = null;
    }

    void printInfo(){
        System.out.println("Name - " + NAME);
        System.out.println("Price - " + PRICE);
        System.out.println("Description - " + DESCRIPTION);
        if ((CATEGORY == null)) {
            System.out.println("Category - empty");
        } else {
           CATEGORY.printInfo();
        }
        System.out.println();
    }
}
