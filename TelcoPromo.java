// TelcoPromo.java (Main Method)
public class TelcoPromo {
    public static void main(String[] args) {
        // Creating TelcoSubscription Objects
        TelcoSubscription smart = new Telco("Smart", 15, 500.0, false);
        TelcoSubscription globe = new Telco("Globe", 10, 450.0, true);
        TelcoSubscription ditto = new Telco("Ditto", 8, 400.0, true);

        // Creating Promo Objects
        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        // Printing Data Usage Offers
        System.out.println("Smart Data Usage Offer and price: " +
                promo.showAllowance(smart.getTelcoName(), smart.getDataAllowance(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " +
                promo.showAllowance(globe.getTelcoName(), globe.getDataAllowance(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " +
                promo.showAllowance(ditto.getTelcoName(), ditto.getDataAllowance(), ditto.getPromoPrice()));

        // Printing Unlimited Calls & Text Offers
        System.out.println("\nSmart unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}
