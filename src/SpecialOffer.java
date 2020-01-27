import java.util.Date;

class SpecialOffer {
    final Product PRODUCT;
    final String OFFER_DESCRIPTION;
    final Date START_TIME;
    final Date END_TIME;
    final float PERCENT_DISCOUNT;

    SpecialOffer(Product product, String offerDescription, Date startTime, Date endTime, float percentDiscount){
        PRODUCT = product;
        OFFER_DESCRIPTION = offerDescription;
        START_TIME = startTime;
        END_TIME = endTime;
        PERCENT_DISCOUNT = percentDiscount;
    }

    void printInfo(){
        System.out.println("Special offer");
        System.out.println("For " + PRODUCT.NAME);
        System.out.println("Offer description - " + OFFER_DESCRIPTION);
        System.out.println("From " + START_TIME + " to " + END_TIME);
        System.out.println("Percent discount - " + (int)(PERCENT_DISCOUNT*100) + "%");
        System.out.println();
    }
}
