public class Category {
    final String NAME;
    final String DESCRIPTION;

    Category(String name, String description){
        NAME = name;
        DESCRIPTION = description;
    }

    void printInfo(){
        System.out.println("Category - " + NAME);
        System.out.println("Category description - " + DESCRIPTION);
    }
}
