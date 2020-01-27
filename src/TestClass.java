import java.util.Date;

public class TestClass {
    public static void main(String[] args) {
        Category sweets = new Category("Sweets", "All kinds of sweets");
        Category drinks = new Category("Drinks", "All kinds of drinks");

        Product cookie = new Product("Chocolate cookie", 3.50F, "Single cookie with chocolate", sweets);
        Product lollipop = new Product("Lollipop", 1F, "Single lollipop", sweets);
        Product cocaCola = new Product("Coca-Cola", 2F, "1L bootle of Coca-Cola", drinks);
        Product tramTicket = new Product("Tram ticket", 0.5F, "Single normal ticket for a tram");

        SpecialOffer specialOffer = new SpecialOffer(cocaCola,
                "Buy 2 bootles and get discount",
                new Date(1580096333656L),
                new Date(1580338800000L),
                0.20F);

        cookie.printInfo();
        lollipop.printInfo();
        tramTicket.printInfo();
        specialOffer.printInfo();

    }
}
